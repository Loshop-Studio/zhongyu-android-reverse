.class public Lcom/umeng/analytics/pro/aj$f;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lg2/w;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/umeng/analytics/pro/aj;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "f"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/umeng/analytics/pro/aj$a;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/umeng/analytics/pro/aj$f;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lcom/umeng/analytics/pro/aj$d;
    .locals 2

    .line 1
    new-instance v0, Lcom/umeng/analytics/pro/aj$d;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/umeng/analytics/pro/aj$d;-><init>(Lcom/umeng/analytics/pro/aj$a;)V

    .line 5
    .line 6
    .line 7
    return-object v0
.end method

.method public synthetic b()Lg2/v;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/umeng/analytics/pro/aj$f;->a()Lcom/umeng/analytics/pro/aj$d;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    return-object v0
.end method
