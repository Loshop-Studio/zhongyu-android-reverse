package org.eclipse.paho.client.mqttv3.internal.security;

import com.tendcloud.tenddata.C7863av;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;
import javax.net.ssl.KeyManager;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import org.eclipse.paho.client.mqttv3.MqttSecurityException;
import org.eclipse.paho.client.mqttv3.logging.Logger;

/* loaded from: classes6.dex */
public class SSLSocketFactoryFactory {
    private static final String CLASS_NAME = "org.eclipse.paho.client.mqttv3.internal.security.SSLSocketFactoryFactory";
    public static final String DEFAULT_PROTOCOL = "TLS";
    public static final String SYSKEYMGRALGO = "ssl.KeyManagerFactory.algorithm";
    public static final String SYSKEYSTORE = "javax.net.ssl.keyStore";
    public static final String SYSKEYSTOREPWD = "javax.net.ssl.keyStorePassword";
    public static final String SYSKEYSTORETYPE = "javax.net.ssl.keyStoreType";
    public static final String SYSTRUSTMGRALGO = "ssl.TrustManagerFactory.algorithm";
    public static final String SYSTRUSTSTORE = "javax.net.ssl.trustStore";
    public static final String SYSTRUSTSTOREPWD = "javax.net.ssl.trustStorePassword";
    public static final String SYSTRUSTSTORETYPE = "javax.net.ssl.trustStoreType";
    private static final String xorTag = "{xor}";
    private Hashtable configs;
    private Properties defaultProperties;
    private Logger logger;
    public static final String SSLPROTOCOL = "com.ibm.ssl.protocol";
    public static final String JSSEPROVIDER = "com.ibm.ssl.contextProvider";
    public static final String KEYSTORE = "com.ibm.ssl.keyStore";
    public static final String KEYSTOREPWD = "com.ibm.ssl.keyStorePassword";
    public static final String KEYSTORETYPE = "com.ibm.ssl.keyStoreType";
    public static final String KEYSTOREPROVIDER = "com.ibm.ssl.keyStoreProvider";
    public static final String KEYSTOREMGR = "com.ibm.ssl.keyManager";
    public static final String TRUSTSTORE = "com.ibm.ssl.trustStore";
    public static final String TRUSTSTOREPWD = "com.ibm.ssl.trustStorePassword";
    public static final String TRUSTSTORETYPE = "com.ibm.ssl.trustStoreType";
    public static final String TRUSTSTOREPROVIDER = "com.ibm.ssl.trustStoreProvider";
    public static final String TRUSTSTOREMGR = "com.ibm.ssl.trustManager";
    public static final String CIPHERSUITES = "com.ibm.ssl.enabledCipherSuites";
    public static final String CLIENTAUTH = "com.ibm.ssl.clientAuthentication";
    private static final String[] propertyKeys = {SSLPROTOCOL, JSSEPROVIDER, KEYSTORE, KEYSTOREPWD, KEYSTORETYPE, KEYSTOREPROVIDER, KEYSTOREMGR, TRUSTSTORE, TRUSTSTOREPWD, TRUSTSTORETYPE, TRUSTSTOREPROVIDER, TRUSTSTOREMGR, CIPHERSUITES, CLIENTAUTH};
    private static final byte[] key = {-99, -89, -39, -128, 5, -72, -119, -100};

    public SSLSocketFactoryFactory() {
        this.logger = null;
        this.configs = new Hashtable();
    }

    private void checkPropertyKeys(Properties properties) {
        for (String str : properties.keySet()) {
            if (!keyValid(str)) {
                throw new IllegalArgumentException(String.valueOf(str) + " is not a valid IBM SSL property key.");
            }
        }
    }

    private void convertPassword(Properties properties) {
        String property = properties.getProperty(KEYSTOREPWD);
        if (property != null && !property.startsWith(xorTag)) {
            properties.put(KEYSTOREPWD, obfuscate(property.toCharArray()));
        }
        String property2 = properties.getProperty(TRUSTSTOREPWD);
        if (property2 == null || property2.startsWith(xorTag)) {
            return;
        }
        properties.put(TRUSTSTOREPWD, obfuscate(property2.toCharArray()));
    }

    public static char[] deObfuscate(String str) {
        if (str == null) {
            return null;
        }
        try {
            byte[] bArrDecode = SimpleBase64Encoder.decode(str.substring(5));
            for (int i10 = 0; i10 < bArrDecode.length; i10++) {
                byte b10 = bArrDecode[i10];
                byte[] bArr = key;
                bArrDecode[i10] = (byte) ((b10 ^ bArr[i10 % bArr.length]) & 255);
            }
            return toChar(bArrDecode);
        } catch (Exception unused) {
            return null;
        }
    }

    private String getProperty(String str, String str2, String str3) {
        String propertyFromConfig = getPropertyFromConfig(str, str2);
        return (propertyFromConfig == null && str3 != null) ? System.getProperty(str3) : propertyFromConfig;
    }

    private String getPropertyFromConfig(String str, String str2) {
        String property = null;
        Properties properties = str != null ? (Properties) this.configs.get(str) : null;
        if (properties != null && (property = properties.getProperty(str2)) != null) {
            return property;
        }
        Properties properties2 = this.defaultProperties;
        return properties2 != null ? properties2.getProperty(str2) : property;
    }

    private SSLContext getSSLContext(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, MqttSecurityException {
        KeyManager[] keyManagers;
        TrustManager[] trustManagers;
        String sSLProtocol = getSSLProtocol(str);
        if (sSLProtocol == null) {
            sSLProtocol = DEFAULT_PROTOCOL;
        }
        Logger logger = this.logger;
        if (logger != null) {
            logger.fine(CLASS_NAME, "getSSLContext", "12000", new Object[]{str != null ? str : "null (broker defaults)", sSLProtocol});
        }
        String jSSEProvider = getJSSEProvider(str);
        try {
            SSLContext sSLContext = jSSEProvider == null ? SSLContext.getInstance(sSLProtocol) : SSLContext.getInstance(sSLProtocol, jSSEProvider);
            Logger logger2 = this.logger;
            if (logger2 != null) {
                logger2.fine(CLASS_NAME, "getSSLContext", "12001", new Object[]{str != null ? str : "null (broker defaults)", sSLContext.getProvider().getName()});
            }
            String property = getProperty(str, KEYSTORE, null);
            if (property == null) {
                property = getProperty(str, KEYSTORE, SYSKEYSTORE);
            }
            Logger logger3 = this.logger;
            if (logger3 != null) {
                logger3.fine(CLASS_NAME, "getSSLContext", "12004", new Object[]{str != null ? str : "null (broker defaults)", property != null ? property : "null"});
            }
            char[] keyStorePassword = getKeyStorePassword(str);
            Logger logger4 = this.logger;
            if (logger4 != null) {
                logger4.fine(CLASS_NAME, "getSSLContext", "12005", new Object[]{str != null ? str : "null (broker defaults)", keyStorePassword != null ? obfuscate(keyStorePassword) : "null"});
            }
            String keyStoreType = getKeyStoreType(str);
            if (keyStoreType == null) {
                keyStoreType = KeyStore.getDefaultType();
            }
            Logger logger5 = this.logger;
            if (logger5 != null) {
                logger5.fine(CLASS_NAME, "getSSLContext", "12006", new Object[]{str != null ? str : "null (broker defaults)", keyStoreType != null ? keyStoreType : "null"});
            }
            String defaultAlgorithm = KeyManagerFactory.getDefaultAlgorithm();
            String keyStoreProvider = getKeyStoreProvider(str);
            String keyManager = getKeyManager(str);
            if (keyManager != null) {
                defaultAlgorithm = keyManager;
            }
            if (property == null || keyStoreType == null || defaultAlgorithm == null) {
                keyManagers = null;
            } else {
                try {
                    KeyStore keyStore = KeyStore.getInstance(keyStoreType);
                    keyStore.load(new FileInputStream(property), keyStorePassword);
                    KeyManagerFactory keyManagerFactory = keyStoreProvider != null ? KeyManagerFactory.getInstance(defaultAlgorithm, keyStoreProvider) : KeyManagerFactory.getInstance(defaultAlgorithm);
                    Logger logger6 = this.logger;
                    if (logger6 != null) {
                        logger6.fine(CLASS_NAME, "getSSLContext", "12010", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm});
                        this.logger.fine(CLASS_NAME, "getSSLContext", "12009", new Object[]{str != null ? str : "null (broker defaults)", keyManagerFactory.getProvider().getName()});
                    }
                    keyManagerFactory.init(keyStore, keyStorePassword);
                    keyManagers = keyManagerFactory.getKeyManagers();
                } catch (FileNotFoundException e10) {
                    throw new MqttSecurityException(e10);
                } catch (IOException e11) {
                    throw new MqttSecurityException(e11);
                } catch (KeyStoreException e12) {
                    throw new MqttSecurityException(e12);
                } catch (UnrecoverableKeyException e13) {
                    throw new MqttSecurityException(e13);
                } catch (CertificateException e14) {
                    throw new MqttSecurityException(e14);
                }
            }
            String trustStore = getTrustStore(str);
            Logger logger7 = this.logger;
            if (logger7 != null) {
                logger7.fine(CLASS_NAME, "getSSLContext", "12011", new Object[]{str != null ? str : "null (broker defaults)", trustStore != null ? trustStore : "null"});
            }
            char[] trustStorePassword = getTrustStorePassword(str);
            Logger logger8 = this.logger;
            if (logger8 != null) {
                logger8.fine(CLASS_NAME, "getSSLContext", "12012", new Object[]{str != null ? str : "null (broker defaults)", trustStorePassword != null ? obfuscate(trustStorePassword) : "null"});
            }
            String trustStoreType = getTrustStoreType(str);
            if (trustStoreType == null) {
                trustStoreType = KeyStore.getDefaultType();
            }
            Logger logger9 = this.logger;
            if (logger9 != null) {
                logger9.fine(CLASS_NAME, "getSSLContext", "12013", new Object[]{str != null ? str : "null (broker defaults)", trustStoreType != null ? trustStoreType : "null"});
            }
            String defaultAlgorithm2 = TrustManagerFactory.getDefaultAlgorithm();
            String trustStoreProvider = getTrustStoreProvider(str);
            String trustManager = getTrustManager(str);
            if (trustManager != null) {
                defaultAlgorithm2 = trustManager;
            }
            if (trustStore == null || trustStoreType == null || defaultAlgorithm2 == null) {
                trustManagers = null;
            } else {
                try {
                    KeyStore keyStore2 = KeyStore.getInstance(trustStoreType);
                    keyStore2.load(new FileInputStream(trustStore), trustStorePassword);
                    TrustManagerFactory trustManagerFactory = trustStoreProvider != null ? TrustManagerFactory.getInstance(defaultAlgorithm2, trustStoreProvider) : TrustManagerFactory.getInstance(defaultAlgorithm2);
                    Logger logger10 = this.logger;
                    if (logger10 != null) {
                        logger10.fine(CLASS_NAME, "getSSLContext", "12017", new Object[]{str != null ? str : "null (broker defaults)", defaultAlgorithm2});
                        Logger logger11 = this.logger;
                        if (str == null) {
                            str = "null (broker defaults)";
                        }
                        logger11.fine(CLASS_NAME, "getSSLContext", "12016", new Object[]{str, trustManagerFactory.getProvider().getName()});
                    }
                    trustManagerFactory.init(keyStore2);
                    trustManagers = trustManagerFactory.getTrustManagers();
                } catch (FileNotFoundException e15) {
                    throw new MqttSecurityException(e15);
                } catch (IOException e16) {
                    throw new MqttSecurityException(e16);
                } catch (KeyStoreException e17) {
                    throw new MqttSecurityException(e17);
                } catch (CertificateException e18) {
                    throw new MqttSecurityException(e18);
                }
            }
            sSLContext.init(keyManagers, trustManagers, null);
            return sSLContext;
        } catch (KeyManagementException e19) {
            throw new MqttSecurityException(e19);
        } catch (NoSuchAlgorithmException e20) {
            throw new MqttSecurityException(e20);
        } catch (NoSuchProviderException e21) {
            throw new MqttSecurityException(e21);
        }
    }

    public static boolean isSupportedOnJVM() throws ClassNotFoundException {
        try {
            Class.forName("javax.net.ssl.SSLServerSocketFactory");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    private boolean keyValid(String str) {
        String[] strArr;
        int i10 = 0;
        while (true) {
            strArr = propertyKeys;
            if (i10 >= strArr.length || strArr[i10].equals(str)) {
                break;
            }
            i10++;
        }
        return i10 < strArr.length;
    }

    public static String obfuscate(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = toByte(cArr);
        for (int i10 = 0; i10 < bArr.length; i10++) {
            byte b10 = bArr[i10];
            byte[] bArr2 = key;
            bArr[i10] = (byte) ((b10 ^ bArr2[i10 % bArr2.length]) & 255);
        }
        return xorTag + new String(SimpleBase64Encoder.encode(bArr));
    }

    public static String packCipherSuites(String[] strArr) {
        if (strArr == null) {
            return null;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i10 = 0; i10 < strArr.length; i10++) {
            stringBuffer.append(strArr[i10]);
            if (i10 < strArr.length - 1) {
                stringBuffer.append(',');
            }
        }
        return stringBuffer.toString();
    }

    public static byte[] toByte(char[] cArr) {
        if (cArr == null) {
            return null;
        }
        byte[] bArr = new byte[cArr.length * 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < cArr.length) {
            int i12 = i11 + 1;
            char c10 = cArr[i10];
            bArr[i11] = (byte) (c10 & 255);
            i11 += 2;
            i10++;
            bArr[i12] = (byte) ((c10 >> '\b') & 255);
        }
        return bArr;
    }

    public static char[] toChar(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        char[] cArr = new char[bArr.length / 2];
        int i10 = 0;
        int i11 = 0;
        while (i10 < bArr.length) {
            int i12 = i10 + 1;
            int i13 = bArr[i10] & C7863av.f14384i;
            i10 += 2;
            cArr[i11] = (char) (i13 + ((bArr[i12] & C7863av.f14384i) << 8));
            i11++;
        }
        return cArr;
    }

    public static String[] unpackCipherSuites(String str) {
        if (str == null) {
            return null;
        }
        Vector vector = new Vector();
        int iIndexOf = str.indexOf(44);
        int i10 = 0;
        while (iIndexOf > -1) {
            vector.add(str.substring(i10, iIndexOf));
            i10 = iIndexOf + 1;
            iIndexOf = str.indexOf(44, i10);
        }
        vector.add(str.substring(i10));
        String[] strArr = new String[vector.size()];
        vector.toArray(strArr);
        return strArr;
    }

    public SSLSocketFactory createSocketFactory(String str) throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException, KeyManagementException, MqttSecurityException {
        SSLContext sSLContext = getSSLContext(str);
        Logger logger = this.logger;
        if (logger != null) {
            logger.fine(CLASS_NAME, "createSocketFactory", "12020", new Object[]{str != null ? str : "null (broker defaults)", getEnabledCipherSuites(str) != null ? getProperty(str, CIPHERSUITES, null) : "null (using platform-enabled cipher suites)"});
        }
        return sSLContext.getSocketFactory();
    }

    public boolean getClientAuthentication(String str) {
        String property = getProperty(str, CLIENTAUTH, null);
        if (property != null) {
            return Boolean.valueOf(property).booleanValue();
        }
        return false;
    }

    public Properties getConfiguration(String str) {
        return (Properties) (str == null ? this.defaultProperties : this.configs.get(str));
    }

    public String[] getEnabledCipherSuites(String str) {
        return unpackCipherSuites(getProperty(str, CIPHERSUITES, null));
    }

    public String getJSSEProvider(String str) {
        return getProperty(str, JSSEPROVIDER, null);
    }

    public String getKeyManager(String str) {
        return getProperty(str, KEYSTOREMGR, SYSKEYMGRALGO);
    }

    public String getKeyStore(String str) {
        String propertyFromConfig = getPropertyFromConfig(str, KEYSTORE);
        return propertyFromConfig != null ? propertyFromConfig : System.getProperty(SYSKEYSTORE);
    }

    public char[] getKeyStorePassword(String str) {
        String property = getProperty(str, KEYSTOREPWD, SYSKEYSTOREPWD);
        if (property != null) {
            return property.startsWith(xorTag) ? deObfuscate(property) : property.toCharArray();
        }
        return null;
    }

    public String getKeyStoreProvider(String str) {
        return getProperty(str, KEYSTOREPROVIDER, null);
    }

    public String getKeyStoreType(String str) {
        return getProperty(str, KEYSTORETYPE, SYSKEYSTORETYPE);
    }

    public String getSSLProtocol(String str) {
        return getProperty(str, SSLPROTOCOL, null);
    }

    public String getTrustManager(String str) {
        return getProperty(str, TRUSTSTOREMGR, SYSTRUSTMGRALGO);
    }

    public String getTrustStore(String str) {
        String property = getProperty(str, TRUSTSTORE, SYSTRUSTSTORE);
        try {
            return URLDecoder.decode(property, StandardCharsets.UTF_8.name());
        } catch (Exception unused) {
            return property;
        }
    }

    public char[] getTrustStorePassword(String str) {
        String property = getProperty(str, TRUSTSTOREPWD, SYSTRUSTSTOREPWD);
        if (property != null) {
            return property.startsWith(xorTag) ? deObfuscate(property) : property.toCharArray();
        }
        return null;
    }

    public String getTrustStoreProvider(String str) {
        return getProperty(str, TRUSTSTOREPROVIDER, null);
    }

    public String getTrustStoreType(String str) {
        return getProperty(str, TRUSTSTORETYPE, null);
    }

    public void initialize(Properties properties, String str) {
        checkPropertyKeys(properties);
        Properties properties2 = new Properties();
        properties2.putAll(properties);
        convertPassword(properties2);
        if (str != null) {
            this.configs.put(str, properties2);
        } else {
            this.defaultProperties = properties2;
        }
    }

    public void merge(Properties properties, String str) {
        checkPropertyKeys(properties);
        Properties properties2 = this.defaultProperties;
        if (str != null) {
            properties2 = (Properties) this.configs.get(str);
        }
        if (properties2 == null) {
            properties2 = new Properties();
        }
        convertPassword(properties);
        properties2.putAll(properties);
        if (str != null) {
            this.configs.put(str, properties2);
        } else {
            this.defaultProperties = properties2;
        }
    }

    public boolean remove(String str) {
        if (str != null) {
            return this.configs.remove(str) != null;
        }
        if (this.defaultProperties == null) {
            return false;
        }
        this.defaultProperties = null;
        return true;
    }

    public SSLSocketFactoryFactory(Logger logger) {
        this();
        this.logger = logger;
    }
}
