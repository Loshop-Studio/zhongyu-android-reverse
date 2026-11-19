package androidx.camera.video;

import androidx.annotation.NonNull;
import androidx.camera.video.FallbackStrategy;

/* loaded from: classes.dex */
final class AutoValue_FallbackStrategy_RuleStrategy extends FallbackStrategy.RuleStrategy {
    private final Quality fallbackQuality;
    private final int fallbackRule;

    public AutoValue_FallbackStrategy_RuleStrategy(Quality quality, int i10) {
        if (quality == null) {
            throw new NullPointerException("Null fallbackQuality");
        }
        this.fallbackQuality = quality;
        this.fallbackRule = i10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof FallbackStrategy.RuleStrategy) {
            FallbackStrategy.RuleStrategy ruleStrategy = (FallbackStrategy.RuleStrategy) obj;
            if (this.fallbackQuality.equals(ruleStrategy.getFallbackQuality()) && this.fallbackRule == ruleStrategy.getFallbackRule()) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    @NonNull
    public Quality getFallbackQuality() {
        return this.fallbackQuality;
    }

    @Override // androidx.camera.video.FallbackStrategy.RuleStrategy
    public int getFallbackRule() {
        return this.fallbackRule;
    }

    public int hashCode() {
        return ((this.fallbackQuality.hashCode() ^ 1000003) * 1000003) ^ this.fallbackRule;
    }

    public String toString() {
        return "RuleStrategy{fallbackQuality=" + this.fallbackQuality + ", fallbackRule=" + this.fallbackRule + "}";
    }
}
