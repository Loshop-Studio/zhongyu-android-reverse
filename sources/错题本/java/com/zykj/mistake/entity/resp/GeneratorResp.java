package com.zykj.mistake.entity.resp;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/GeneratorResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;", "getResult", "()Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;", "setResult", "(Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;)V", "Credential", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class GeneratorResp extends ApiResp {
    public static final int $stable = 8;

    @Nullable
    private Credential result;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\t¨\u0006\""}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/GeneratorResp$Credential;", "", "<init>", "()V", "strategy", "", "getStrategy", "()Ljava/lang/String;", "setStrategy", "(Ljava/lang/String;)V", "appId", "getAppId", "setAppId", "bucket", "getBucket", "setBucket", "endpoint", "getEndpoint", "setEndpoint", "region", "getRegion", "setRegion", "accessKeyId", "getAccessKeyId", "setAccessKeyId", "accessKeySecret", "getAccessKeySecret", "setAccessKeySecret", "securityToken", "getSecurityToken", "setSecurityToken", "expiration", "getExpiration", "setExpiration", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Credential {
        public static final int $stable = 8;

        @Nullable
        private String accessKeyId;

        @Nullable
        private String accessKeySecret;

        @Nullable
        private String appId;

        @Nullable
        private String bucket;

        @Nullable
        private String endpoint;

        @Nullable
        private String expiration;

        @Nullable
        private String region;

        @Nullable
        private String securityToken;

        @Nullable
        private String strategy;

        @Nullable
        public final String getAccessKeyId() {
            return this.accessKeyId;
        }

        @Nullable
        public final String getAccessKeySecret() {
            return this.accessKeySecret;
        }

        @Nullable
        public final String getAppId() {
            return this.appId;
        }

        @Nullable
        public final String getBucket() {
            return this.bucket;
        }

        @Nullable
        public final String getEndpoint() {
            return this.endpoint;
        }

        @Nullable
        public final String getExpiration() {
            return this.expiration;
        }

        @Nullable
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        public final String getSecurityToken() {
            return this.securityToken;
        }

        @Nullable
        public final String getStrategy() {
            return this.strategy;
        }

        public final void setAccessKeyId(@Nullable String str) {
            this.accessKeyId = str;
        }

        public final void setAccessKeySecret(@Nullable String str) {
            this.accessKeySecret = str;
        }

        public final void setAppId(@Nullable String str) {
            this.appId = str;
        }

        public final void setBucket(@Nullable String str) {
            this.bucket = str;
        }

        public final void setEndpoint(@Nullable String str) {
            this.endpoint = str;
        }

        public final void setExpiration(@Nullable String str) {
            this.expiration = str;
        }

        public final void setRegion(@Nullable String str) {
            this.region = str;
        }

        public final void setSecurityToken(@Nullable String str) {
            this.securityToken = str;
        }

        public final void setStrategy(@Nullable String str) {
            this.strategy = str;
        }
    }

    @Nullable
    public final Credential getResult() {
        return this.result;
    }

    public final void setResult(@Nullable Credential credential) {
        this.result = credential;
    }
}
