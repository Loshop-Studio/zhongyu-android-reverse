package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\u000b"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/UserInfoResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "Lcom/zykj/mistake/entity/resp/UserInfoResp$UserInfo;", "getResult", "()Lcom/zykj/mistake/entity/resp/UserInfoResp$UserInfo;", "setResult", "(Lcom/zykj/mistake/entity/resp/UserInfoResp$UserInfo;)V", "UserInfo", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class UserInfoResp extends ApiResp {
    public static final int $stable = 8;

    @Nullable
    private UserInfo result;

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010 \n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0016\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\r\"\u0004\b\u0018\u0010\u000fR\u001a\u0010\u0019\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001a\u0010\u001c\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\u001a\u0010\u001f\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\r\"\u0004\b!\u0010\u000fR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00050#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/UserInfoResp$UserInfo;", "", "<init>", "()V", "id", "", "getId", "()I", "setId", "(I)V", "userName", "", "getUserName", "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "realName", "getRealName", "setRealName", "surname", "getSurname", "setSurname", HintConstants.AUTOFILL_HINT_NAME, "getName", "setName", "mobile", "getMobile", "setMobile", NotificationCompat.CATEGORY_EMAIL, "getEmail", "setEmail", "photo", "getPhoto", "setPhoto", "roles", "", "getRoles", "()Ljava/util/List;", "setRoles", "(Ljava/util/List;)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class UserInfo {
        public static final int $stable = 8;
        private int id;

        @NotNull
        private String userName = "";

        @NotNull
        private String realName = "";

        @NotNull
        private String surname = "";

        @NotNull
        private String name = "";

        @NotNull
        private String mobile = "";

        @NotNull
        private String email = "";

        @NotNull
        private String photo = "";

        @NotNull
        private List<Integer> roles = new ArrayList();

        @NotNull
        public final String getEmail() {
            return this.email;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final String getMobile() {
            return this.mobile;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final String getPhoto() {
            return this.photo;
        }

        @NotNull
        public final String getRealName() {
            return this.realName;
        }

        @NotNull
        public final List<Integer> getRoles() {
            return this.roles;
        }

        @NotNull
        public final String getSurname() {
            return this.surname;
        }

        @NotNull
        public final String getUserName() {
            return this.userName;
        }

        public final void setEmail(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.email = str;
        }

        public final void setId(int i) {
            this.id = i;
        }

        public final void setMobile(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.mobile = str;
        }

        public final void setName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.name = str;
        }

        public final void setPhoto(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.photo = str;
        }

        public final void setRealName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.realName = str;
        }

        public final void setRoles(@NotNull List<Integer> list) {
            AbstractC5830k.m5330g(list, "<set-?>");
            this.roles = list;
        }

        public final void setSurname(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.surname = str;
        }

        public final void setUserName(@NotNull String str) {
            AbstractC5830k.m5330g(str, "<set-?>");
            this.userName = str;
        }
    }

    @Nullable
    public final UserInfo getResult() {
        return this.result;
    }

    public final void setResult(@Nullable UserInfo userInfo) {
        this.result = userInfo;
    }
}
