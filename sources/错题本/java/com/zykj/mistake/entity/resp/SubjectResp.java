package com.zykj.mistake.entity.resp;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zykj.mistake.network.ApiResp;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC5830k;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata(m5109d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/SubjectResp;", "Lcom/zykj/mistake/network/ApiResp;", "<init>", "()V", "result", "", "Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;", "getResult", "()Ljava/util/List;", "setResult", "(Ljava/util/List;)V", "Subject", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes3.dex */
public final class SubjectResp extends ApiResp {
    public static final int $stable = 8;

    @NotNull
    private List<Subject> result = new ArrayList();

    @StabilityInferred(parameters = 0)
    @Metadata(m5109d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\rX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000bR\u001a\u0010\u0012\u001a\u00020\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m5110d2 = {"Lcom/zykj/mistake/entity/resp/SubjectResp$Subject;", "", "<init>", "()V", "id", "", "getId", "()J", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "sort", "", "getSort", "()I", "content", "getContent", "isActive", "", "()Z", "setActive", "(Z)V", "app_release"}, m5111k = 1, m5112mv = {2, 2, 0}, m5114xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class Subject {
        public static final int $stable = 8;
        private final long id;
        private final int sort;

        @NotNull
        private final String name = "";

        @NotNull
        private final String content = "";
        private boolean isActive = true;

        @NotNull
        public final String getContent() {
            return this.content;
        }

        public final long getId() {
            return this.id;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        public final int getSort() {
            return this.sort;
        }

        /* renamed from: isActive, reason: from getter */
        public final boolean getIsActive() {
            return this.isActive;
        }

        public final void setActive(boolean z8) {
            this.isActive = z8;
        }
    }

    @NotNull
    public final List<Subject> getResult() {
        return this.result;
    }

    public final void setResult(@NotNull List<Subject> list) {
        AbstractC5830k.m5330g(list, "<set-?>");
        this.result = list;
    }
}
