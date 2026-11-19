.class public final Lcom/blankj/utilcode/util/k;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Lcom/blankj/utilcode/util/k;


# instance fields
.field public a:Landroid/app/NotificationChannel;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/blankj/utilcode/util/k;

    .line 2
    .line 3
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/c;->d()Landroid/app/Application;

    .line 12
    .line 13
    .line 14
    move-result-object v2

    .line 15
    invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    move-result-object v2

    .line 19
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 23
    .line 24
    const/16 v4, 0x1a

    .line 25
    .line 26
    if-lt v3, v4, :cond_0

    .line 27
    .line 28
    invoke-static {v1, v2}, Landroidx/core/util/a;->b(Ljava/lang/String;Ljava/lang/String;)Landroid/app/NotificationChannel;

    .line 29
    .line 30
    .line 31
    move-result-object v1

    .line 32
    iput-object v1, v0, Lcom/blankj/utilcode/util/k;->a:Landroid/app/NotificationChannel;

    .line 33
    .line 34
    :cond_0
    sput-object v0, Lcom/blankj/utilcode/util/k;->b:Lcom/blankj/utilcode/util/k;

    .line 35
    .line 36
    return-void
.end method
