package com.zykj.evaluation.bean;

import androidx.autofill.HintConstants;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@StabilityInferred(parameters = 1)
@Metadata(m13557d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0006\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\tR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u000fX\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006\u001b"}, m13558d2 = {"Lcom/zykj/evaluation/bean/BaseGuideQuestion;", "", "<init>", "()V", "id", "", "getId", "()J", HintConstants.AUTOFILL_HINT_NAME, "", "getName", "()Ljava/lang/String;", "number", "getNumber", "askForHelp", "", "getAskForHelp", "()Z", "completed", "getCompleted", "score", "", "getScore", "()D", "myScore", "getMyScore", "getTitle", "app_release"}, m13559k = 1, m13560mv = {2, 2, 0}, m13562xi = 48)
/* loaded from: classes4.dex */
public class BaseGuideQuestion {
    public static final int $stable = 0;
    private final boolean askForHelp;
    private final boolean completed;
    private final long id;
    private final double myScore;
    private final String name;
    private final String number = "";
    private final double score;

    public final boolean getAskForHelp() {
        return this.askForHelp;
    }

    public final boolean getCompleted() {
        return this.completed;
    }

    public final long getId() {
        return this.id;
    }

    public final double getMyScore() {
        return this.myScore;
    }

    public final String getName() {
        return this.name;
    }

    public final String getNumber() {
        return this.number;
    }

    public final double getScore() {
        return this.score;
    }

    public final String getTitle() {
        String str = this.name;
        return (str == null || StringsKt.isBlank(str)) ? this.number : this.name;
    }
}
