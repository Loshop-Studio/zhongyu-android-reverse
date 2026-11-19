package com.alibaba.sdk.android.oss.model;

import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.alibaba.sdk.android.oss.common.OSSHeaders;
import com.alibaba.sdk.android.oss.common.utils.CaseInsensitiveHashMap;
import com.alibaba.sdk.android.oss.common.utils.DateUtil;
import com.alibaba.sdk.android.oss.common.utils.HttpHeaders;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import java.text.ParseException;
import java.util.Collections;
import java.util.Date;
import java.util.Map;

/* loaded from: classes3.dex */
public class ObjectMetadata {
    public static final String AES_256_SERVER_SIDE_ENCRYPTION = "AES256";
    private Map<String, String> userMetadata = new CaseInsensitiveHashMap();
    private Map<String, Object> metadata = new CaseInsensitiveHashMap();

    public void addUserMetadata(String str, String str2) {
        this.userMetadata.put(str, str2);
    }

    public String getCacheControl() {
        return (String) this.metadata.get(HttpHeaders.CACHE_CONTROL);
    }

    public String getContentDisposition() {
        return (String) this.metadata.get(HttpHeaders.CONTENT_DISPOSITION);
    }

    public String getContentEncoding() {
        return (String) this.metadata.get("Content-Encoding");
    }

    public long getContentLength() {
        Long l9 = (Long) this.metadata.get(HttpHeaders.CONTENT_LENGTH);
        if (l9 == null) {
            return 0L;
        }
        return l9.longValue();
    }

    public String getContentMD5() {
        return (String) this.metadata.get(HttpHeaders.CONTENT_MD5);
    }

    public String getContentType() {
        return (String) this.metadata.get(HttpHeaders.CONTENT_TYPE);
    }

    public String getETag() {
        return (String) this.metadata.get(HttpHeaders.ETAG);
    }

    public Date getExpirationTime() throws ParseException {
        return DateUtil.parseRfc822Date((String) this.metadata.get(HttpHeaders.EXPIRES));
    }

    public Date getLastModified() {
        return (Date) this.metadata.get(HttpHeaders.LAST_MODIFIED);
    }

    public String getObjectType() {
        return (String) this.metadata.get(OSSHeaders.OSS_OBJECT_TYPE);
    }

    public String getRawExpiresValue() {
        return (String) this.metadata.get(HttpHeaders.EXPIRES);
    }

    public Map<String, Object> getRawMetadata() {
        return Collections.unmodifiableMap(this.metadata);
    }

    public String getSHA1() {
        return (String) this.metadata.get(OSSHeaders.OSS_HASH_SHA1);
    }

    public String getServerSideEncryption() {
        return (String) this.metadata.get(OSSHeaders.OSS_SERVER_SIDE_ENCRYPTION);
    }

    public Map<String, String> getUserMetadata() {
        return this.userMetadata;
    }

    public void setCacheControl(String str) {
        this.metadata.put(HttpHeaders.CACHE_CONTROL, str);
    }

    public void setContentDisposition(String str) {
        this.metadata.put(HttpHeaders.CONTENT_DISPOSITION, str);
    }

    public void setContentEncoding(String str) {
        this.metadata.put("Content-Encoding", str);
    }

    public void setContentLength(long j9) {
        if (j9 > OSSConstants.DEFAULT_FILE_SIZE_LIMIT) {
            throw new IllegalArgumentException("The content length could not be more than 5GB.");
        }
        this.metadata.put(HttpHeaders.CONTENT_LENGTH, Long.valueOf(j9));
    }

    public void setContentMD5(String str) {
        this.metadata.put(HttpHeaders.CONTENT_MD5, str);
    }

    public void setContentType(String str) {
        this.metadata.put(HttpHeaders.CONTENT_TYPE, str);
    }

    public void setExpirationTime(Date date) {
        this.metadata.put(HttpHeaders.EXPIRES, DateUtil.formatRfc822Date(date));
    }

    public void setHeader(String str, Object obj) {
        this.metadata.put(str, obj);
    }

    public void setLastModified(Date date) {
        this.metadata.put(HttpHeaders.LAST_MODIFIED, date);
    }

    public void setSHA1(String str) {
        this.metadata.put(OSSHeaders.OSS_HASH_SHA1, str);
    }

    public void setServerSideEncryption(String str) {
        this.metadata.put(OSSHeaders.OSS_SERVER_SIDE_ENCRYPTION, str);
    }

    public void setUserMetadata(Map<String, String> map) {
        this.userMetadata.clear();
        if (map == null || map.isEmpty()) {
            return;
        }
        this.userMetadata.putAll(map);
    }

    public String toString() {
        String string;
        try {
            string = getExpirationTime().toString();
        } catch (Exception unused) {
            string = "";
        }
        return "Last-Modified:" + getLastModified() + AbsSection.SEP_ORIGIN_LINE_BREAK + HttpHeaders.EXPIRES + ":" + string + "\nrawExpires:" + getRawExpiresValue() + AbsSection.SEP_ORIGIN_LINE_BREAK + HttpHeaders.CONTENT_MD5 + ":" + getContentMD5() + AbsSection.SEP_ORIGIN_LINE_BREAK + OSSHeaders.OSS_OBJECT_TYPE + ":" + getObjectType() + AbsSection.SEP_ORIGIN_LINE_BREAK + OSSHeaders.OSS_SERVER_SIDE_ENCRYPTION + ":" + getServerSideEncryption() + AbsSection.SEP_ORIGIN_LINE_BREAK + HttpHeaders.CONTENT_DISPOSITION + ":" + getContentDisposition() + AbsSection.SEP_ORIGIN_LINE_BREAK + "Content-Encoding:" + getContentEncoding() + AbsSection.SEP_ORIGIN_LINE_BREAK + HttpHeaders.CACHE_CONTROL + ":" + getCacheControl() + AbsSection.SEP_ORIGIN_LINE_BREAK + HttpHeaders.ETAG + ":" + getETag() + AbsSection.SEP_ORIGIN_LINE_BREAK;
    }
}
