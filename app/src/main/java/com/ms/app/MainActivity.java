package com.ms.app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.ms.module.encryption.AESUtils;
import com.ms.module.encryption.Base64Utils;
import com.ms.module.encryption.EncodeUtils;
import com.ms.module.encryption.EncryptUtils;
import com.ms.module.encryption.HMacHelper;
import com.ms.module.encryption.MD5Utils;
import com.ms.module.encryption.RSAUtils;
import com.ms.module.encryption.SHA1Utils;

import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        KeyPair keyPair = RSAUtils.generateRSAKeyPair();
//        PrivateKey aPrivate = keyPair.getPrivate();
//        PublicKey aPublic = keyPair.getPublic();
//
//        Log.e(TAG, "onCreate: " + aPrivate);
//        Log.e(TAG, "onCreate: " + aPublic);
//
//
//        byte[] bytes = RSAUtils.encryptData("aaa".getBytes(), aPublic);
//
//        String encode = Base64Utils.encode(bytes);
//        Log.e(TAG, "onCreate: 加密 : " + encode);
//
//        byte[] decode = Base64Utils.decode(encode);
//
//        String s = new String(RSAUtils.decryptData(decode, aPrivate));
//
//        Log.e(TAG, "onCreate: 解密: " + s);
//
//
//        Log.e(TAG, "onCreate: "+ SHA1Utils.SHA1("aaa"));
//        Log.e(TAG, "onCreate: "+ MD5Utils.encrypBy("aaa"));
//
//
//        StringZip.main(null);
//
//
//        String aaa = AESUtils.encrypt("AAA");
//
//        Log.e(TAG, "onCreate: aaa : "+aaa );
//
//        String decrypt = AESUtils.decrypt(aaa);
//
//        Log.e(TAG, "onCreate: aaa decrypt: "+decrypt );


        KeyPair keyPair = RSAUtils.generateRSAKeyPair();

        PrivateKey aPrivate = keyPair.getPrivate();
        PublicKey aPublic = keyPair.getPublic();

        HMacHelper hMacHelper = new HMacHelper("aaa");
        byte[] sign = hMacHelper.sign("a".getBytes());
        boolean verify = hMacHelper.verify("aaa".getBytes(), sign);

        Log.e(TAG, "onCreate: "+  verify);



    }
}