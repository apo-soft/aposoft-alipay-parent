/**
 *   Copyright  :  www.aposoft.cn
 */
package org.alipay.api.webapp;

import java.security.InvalidKeyException;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.SignatureException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;

import org.apache.commons.codec.binary.Base64;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.AlipayConstants;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayUserUserinfoShareRequest;
import com.alipay.api.response.AlipayUserUserinfoShareResponse;

import cn.aposoft.alipay.api.config.impl.AlipayConfigFactory;
import cn.aposoft.constant.Lexical;

/**
 * @author LiuJian
 * @date 2016年10月20日
 * 
 */
public class AlipayClientTest {

    /**
     * @param args
     * @throws AlipayApiException
     * @throws NoSuchAlgorithmException
     * @throws InvalidKeySpecException
     * @throws InvalidKeyException
     * @throws SignatureException
     */
    public static void main(String[] args)
            throws AlipayApiException, NoSuchAlgorithmException, InvalidKeySpecException, InvalidKeyException, SignatureException {
        String privateKey = AlipayConfigFactory.getConfig().getPrivateKey();
        System.out.println(privateKey);
        privateKey = privateKey.substring("-----BEGIN PRIVATE KEY-----\n".length(), privateKey.length() - "\n-----END PRIVATE KEY-----".length() - 1);

        byte[] decodedBytes = Base64.decodeBase64(privateKey);
        PKCS8EncodedKeySpec eKey = new PKCS8EncodedKeySpec(decodedBytes);

        KeyFactory keyFactory = KeyFactory.getInstance("RSA");
        PrivateKey pKey = keyFactory.generatePrivate(eKey);
        System.out.println(privateKey);
        System.out.println(pKey);

        java.security.Signature signature = java.security.Signature.getInstance(AlipayConstants.SIGN_ALGORITHMS);

        signature.initSign(pKey);
        byte[] contents = "{a:1}".getBytes();
        signature.update(contents);
        byte[] signed = signature.sign();

        String signedStr = Base64.encodeBase64String(signed);
        String signedSig = "TqwfGXXP0/tKjD757E2/kLaPzV/lEhWPFoZdMzTap7j7WW3+WSWcIUJmeN/wm1IsH94HDL54YnQzTk4kxzvvSum/v2RmTK0kfxLFtbOVtUvr2FFWNXUW51PlXmf5wSiRU/BIGwJ//kDHDEY9F8iQ3Fii58evcyBExHoUwV1LX2A=";

        byte[] decodedSig = Base64.decodeBase64(signedSig);

        System.out.println("signed str:" + signedStr);
        String publicKey = AlipayConfigFactory.getConfig().getPublicKey();
        publicKey = publicKey.substring("-----BEGIN PUBLIC KEY-----\n".length(), publicKey.length() - 1 - "\n-----END PUBLIC KEY-----".length());
        System.out.println(publicKey);

        AlipayClient alipayClient = new DefaultAlipayClient("https://openapi.alipaydev.com/gateway.do", AlipayConfigFactory.getConfig().getAppId(),
                privateKey, Lexical.JSON, Lexical.GBK, publicKey);
        AlipayUserUserinfoShareRequest request = new AlipayUserUserinfoShareRequest();
        AlipayUserUserinfoShareResponse result = alipayClient.execute(request, "2dab9e54d6e540f584417faea3e6UA78");

    }

}
