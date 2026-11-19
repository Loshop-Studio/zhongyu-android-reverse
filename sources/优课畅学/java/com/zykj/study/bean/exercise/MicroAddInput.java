package com.zykj.study.bean.exercise;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.AbstractC9133u;

@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class MicroAddInput {
    public static final int $stable = 0;
    private final String attachment;
    private final String name;
    private final int questionGroupId;
    private final String questionId;
    private final String type;

    public MicroAddInput(int i10, String questionId, String attachment, String type, String name) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(attachment, "attachment");
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(name, "name");
        this.questionGroupId = i10;
        this.questionId = questionId;
        this.attachment = attachment;
        this.type = type;
        this.name = name;
    }

    public static /* synthetic */ MicroAddInput copy$default(MicroAddInput microAddInput, int i10, String str, String str2, String str3, String str4, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = microAddInput.questionGroupId;
        }
        if ((i11 & 2) != 0) {
            str = microAddInput.questionId;
        }
        if ((i11 & 4) != 0) {
            str2 = microAddInput.attachment;
        }
        if ((i11 & 8) != 0) {
            str3 = microAddInput.type;
        }
        if ((i11 & 16) != 0) {
            str4 = microAddInput.name;
        }
        String str5 = str4;
        String str6 = str2;
        return microAddInput.copy(i10, str, str6, str3, str5);
    }

    public final int component1() {
        return this.questionGroupId;
    }

    public final String component2() {
        return this.questionId;
    }

    public final String component3() {
        return this.attachment;
    }

    public final String component4() {
        return this.type;
    }

    public final String component5() {
        return this.name;
    }

    public final MicroAddInput copy(int i10, String questionId, String attachment, String type, String name) {
        AbstractC9133u.m16133g(questionId, "questionId");
        AbstractC9133u.m16133g(attachment, "attachment");
        AbstractC9133u.m16133g(type, "type");
        AbstractC9133u.m16133g(name, "name");
        return new MicroAddInput(i10, questionId, attachment, type, name);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MicroAddInput)) {
            return false;
        }
        MicroAddInput microAddInput = (MicroAddInput) obj;
        return this.questionGroupId == microAddInput.questionGroupId && AbstractC9133u.m16128b(this.questionId, microAddInput.questionId) && AbstractC9133u.m16128b(this.attachment, microAddInput.attachment) && AbstractC9133u.m16128b(this.type, microAddInput.type) && AbstractC9133u.m16128b(this.name, microAddInput.name);
    }

    public final String getAttachment() {
        return this.attachment;
    }

    public final String getName() {
        return this.name;
    }

    public final int getQuestionGroupId() {
        return this.questionGroupId;
    }

    public final String getQuestionId() {
        return this.questionId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        return (((((((Integer.hashCode(this.questionGroupId) * 31) + this.questionId.hashCode()) * 31) + this.attachment.hashCode()) * 31) + this.type.hashCode()) * 31) + this.name.hashCode();
    }

    public String toString() {
        return "MicroAddInput(questionGroupId=" + this.questionGroupId + ", questionId=" + this.questionId + ", attachment=" + this.attachment + ", type=" + this.type + ", name=" + this.name + ")";
    }
}
