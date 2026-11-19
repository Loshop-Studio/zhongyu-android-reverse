.class public Lcom/tendcloud/dot/LayoutInflaterHooker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;
    }
.end annotation


# static fields
.field public static hookLayoutXmlOnClick:Z = false


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static hookLayoutInflater(Landroid/content/Context;)V
    .locals 1

    .line 1
    sget-boolean v0, Lcom/tendcloud/dot/LayoutInflaterHooker;->hookLayoutXmlOnClick:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    :try_start_0
    invoke-static {p0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 6
    .line 7
    .line 8
    move-result-object p0

    .line 9
    invoke-static {}, Lcom/tendcloud/dot/LayoutInflaterHooker$LayoutInflaterOnClickFactory;->createFactory()Landroid/view/LayoutInflater$Factory;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    invoke-virtual {p0, v0}, Landroid/view/LayoutInflater;->setFactory(Landroid/view/LayoutInflater$Factory;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 14
    .line 15
    .line 16
    return-void

    .line 17
    :catchall_0
    move-exception p0

    .line 18
    invoke-static {p0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    return-void
.end method
