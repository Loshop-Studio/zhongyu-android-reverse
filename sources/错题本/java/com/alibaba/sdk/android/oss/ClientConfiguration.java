package com.alibaba.sdk.android.oss;

import com.alibaba.sdk.android.oss.common.HttpProtocol;
import com.alibaba.sdk.android.oss.signer.SignVersion;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutorService;
import okhttp3.C6338z;

/* loaded from: classes2.dex */
public class ClientConfiguration {
    private static final int DEFAULT_MAX_RETRIES = 2;
    private String ipWithHeader;
    private String mUserAgentMark;
    private String proxyHost;
    private int proxyPort;
    private int maxConcurrentRequest = 5;
    private int maxConcurrentRequestsPerHost = -1;
    private int socketTimeout = 60000;
    private int connectionTimeout = 60000;
    private long max_log_size = 5242880;
    private int maxErrorRetry = 2;
    private List<String> customCnameExcludeList = new ArrayList();
    private boolean httpDnsEnable = false;
    private boolean checkCRC64 = false;
    private boolean pathStyleAccessEnable = false;
    private boolean customPathPrefixEnable = false;
    private boolean followRedirectsEnable = false;
    private C6338z okHttpClient = null;
    private ExecutorService executorService = null;
    private SignVersion signVersion = SignVersion.V1;
    private HttpProtocol httpProtocol = HttpProtocol.HTTPS;

    public static ClientConfiguration getDefaultConf() {
        return new ClientConfiguration();
    }

    public int getConnectionTimeout() {
        return this.connectionTimeout;
    }

    public List<String> getCustomCnameExcludeList() {
        return Collections.unmodifiableList(this.customCnameExcludeList);
    }

    public String getCustomUserMark() {
        return this.mUserAgentMark;
    }

    public ExecutorService getExecutorService() {
        return this.executorService;
    }

    public HttpProtocol getHttpProtocol() {
        return this.httpProtocol;
    }

    public String getIpWithHeader() {
        return this.ipWithHeader;
    }

    public int getMaxConcurrentRequest() {
        return this.maxConcurrentRequest;
    }

    public int getMaxConcurrentRequestsPerHost() {
        return this.maxConcurrentRequestsPerHost;
    }

    public int getMaxErrorRetry() {
        return this.maxErrorRetry;
    }

    public long getMaxLogSize() {
        return this.max_log_size;
    }

    public C6338z getOkHttpClient() {
        return this.okHttpClient;
    }

    public String getProxyHost() {
        return this.proxyHost;
    }

    public int getProxyPort() {
        return this.proxyPort;
    }

    public SignVersion getSignVersion() {
        return this.signVersion;
    }

    public int getSocketTimeout() {
        return this.socketTimeout;
    }

    public boolean isCheckCRC64() {
        return this.checkCRC64;
    }

    public boolean isCustomPathPrefixEnable() {
        return this.customPathPrefixEnable;
    }

    public boolean isFollowRedirectsEnable() {
        return this.followRedirectsEnable;
    }

    public boolean isHttpDnsEnable() {
        return this.httpDnsEnable;
    }

    public boolean isPathStyleAccessEnable() {
        return this.pathStyleAccessEnable;
    }

    public void setCheckCRC64(boolean z8) {
        this.checkCRC64 = z8;
    }

    public void setConnectionTimeout(int i) {
        this.connectionTimeout = i;
    }

    public void setCustomCnameExcludeList(List<String> list) {
        if (list == null || list.size() == 0) {
            throw new IllegalArgumentException("cname exclude list should not be null.");
        }
        this.customCnameExcludeList.clear();
        for (String str : list) {
            if (str.contains("://")) {
                this.customCnameExcludeList.add(str.substring(str.indexOf("://") + 3));
            } else {
                this.customCnameExcludeList.add(str);
            }
        }
    }

    public void setCustomPathPrefixEnable(boolean z8) {
        this.customPathPrefixEnable = z8;
    }

    public void setExecutorService(ExecutorService executorService) {
        this.executorService = executorService;
    }

    public void setFollowRedirectsEnable(boolean z8) {
        this.followRedirectsEnable = z8;
    }

    public void setHttpDnsEnable(boolean z8) {
        this.httpDnsEnable = z8;
    }

    public void setHttpProtocol(HttpProtocol httpProtocol) {
        this.httpProtocol = httpProtocol;
    }

    public void setIpWithHeader(String str) {
        this.ipWithHeader = str;
    }

    public void setMaxConcurrentRequest(int i) {
        this.maxConcurrentRequest = i;
    }

    public void setMaxConcurrentRequestsPerHost(int i) {
        this.maxConcurrentRequestsPerHost = i;
    }

    public void setMaxErrorRetry(int i) {
        this.maxErrorRetry = i;
    }

    public void setMaxLogSize(long j7) {
        this.max_log_size = j7;
    }

    public void setOkHttpClient(C6338z c6338z) {
        this.okHttpClient = c6338z;
    }

    public void setPathStyleAccessEnable(boolean z8) {
        this.pathStyleAccessEnable = z8;
    }

    public void setProxyHost(String str) {
        this.proxyHost = str;
    }

    public void setProxyPort(int i) {
        this.proxyPort = i;
    }

    public void setSignVersion(SignVersion signVersion) {
        this.signVersion = signVersion;
    }

    public void setSocketTimeout(int i) {
        this.socketTimeout = i;
    }

    public void setUserAgentMark(String str) {
        this.mUserAgentMark = str;
    }
}
