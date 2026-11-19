.class public Lcom/taobao/sophix/c/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lcom/taobao/sophix/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static a(Lcom/taobao/sophix/c/a;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/taobao/sophix/c/b;->a:Lcom/taobao/sophix/c/a;

    return-void
.end method

.method public static a(Lcom/taobao/sophix/c/c;)V
    .locals 1

    .line 2
    sget-object v0, Lcom/taobao/sophix/c/b;->a:Lcom/taobao/sophix/c/a;

    if-eqz v0, :cond_0

    .line 3
    invoke-interface {v0, p0}, Lcom/taobao/sophix/c/a;->a(Lcom/taobao/sophix/c/c;)V

    :cond_0
    return-void
.end method
