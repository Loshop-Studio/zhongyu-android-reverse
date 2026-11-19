.class final Lcom/taobao/sophix/d/c/a$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/taobao/sophix/d/c/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# static fields
.field private static final a:Lcom/taobao/sophix/d/c/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lcom/taobao/sophix/d/c/a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lcom/taobao/sophix/d/c/a;-><init>(Lcom/taobao/sophix/d/c/a$1;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lcom/taobao/sophix/d/c/a$a;->a:Lcom/taobao/sophix/d/c/a;

    .line 8
    .line 9
    return-void
.end method

.method public static synthetic a()Lcom/taobao/sophix/d/c/a;
    .locals 1

    .line 1
    sget-object v0, Lcom/taobao/sophix/d/c/a$a;->a:Lcom/taobao/sophix/d/c/a;

    .line 2
    .line 3
    return-object v0
.end method
