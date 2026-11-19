.class public interface abstract Lcom/zykj/blackboard/core/record/ITimeRecord;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/zykj/blackboard/core/record/ITimeRecord$DefaultImpls;
    }
.end annotation


# virtual methods
.method public abstract getDelayTime(JZ)J
.end method

.method public abstract getTime(J)J
.end method

.method public abstract init(J)V
.end method

.method public abstract isRecord()Z
.end method

.method public abstract reset()V
.end method

.method public abstract setListener(Lcom/zykj/blackboard/listener/RecordListener;)V
.end method

.method public abstract startRecord(J)V
.end method

.method public abstract stopRecord(J)V
.end method
