.class public final synthetic Lcom/zykj/subscriber/update/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/zykj/subscriber/update/c$d;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/update/PercentCircleView;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/update/PercentCircleView;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/subscriber/update/a;->a:Lcom/zykj/subscriber/update/PercentCircleView;

    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    iget-object v0, p0, Lcom/zykj/subscriber/update/a;->a:Lcom/zykj/subscriber/update/PercentCircleView;

    invoke-virtual {v0, p1}, Lcom/zykj/subscriber/update/PercentCircleView;->setTargetPercent(F)V

    return-void
.end method
