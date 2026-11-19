package com.zykj.student.dialogue.bean.req;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;

@Metadata(m13412d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0006R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0001\u0007¨\u0006\bÀ\u0006\u0003"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/SettingProperty;", "", "value", "", "getValue", "()Ljava/lang/String;", "QuoraSearchable", "Lcom/zykj/student/dialogue/bean/req/SettingProperty$QuoraSearchable;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes5.dex */
public interface SettingProperty {

    @StabilityInferred(parameters = 1)
    @Metadata(m13412d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m13413d2 = {"Lcom/zykj/student/dialogue/bean/req/SettingProperty$QuoraSearchable;", "Lcom/zykj/student/dialogue/bean/req/SettingProperty;", "<init>", "()V", "value", "", "getValue", "()Ljava/lang/String;", "app_release"}, m13414k = 1, m13415mv = {2, 2, 0}, m13417xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
    public static final class QuoraSearchable implements SettingProperty {
        public static final int $stable = 0;
        public static final QuoraSearchable INSTANCE = new QuoraSearchable();
        private static final String value = "QuoraSearchEnable";

        private QuoraSearchable() {
        }

        @Override // com.zykj.student.dialogue.bean.req.SettingProperty
        public String getValue() {
            return value;
        }
    }

    String getValue();
}
