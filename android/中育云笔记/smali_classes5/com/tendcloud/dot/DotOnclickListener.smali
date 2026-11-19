.class public Lcom/tendcloud/dot/DotOnclickListener;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;
    }
.end annotation


# static fields
.field private static b:Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;


# instance fields
.field private a:Landroid/view/View$OnClickListener;


# direct methods
.method private constructor <init>(Landroid/view/View$OnClickListener;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/tendcloud/dot/DotOnclickListener;->a:Landroid/view/View$OnClickListener;

    .line 5
    .line 6
    return-void
.end method

.method private a()Landroid/view/View$OnClickListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnclickListener;->a:Landroid/view/View$OnClickListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public static getDotOnclickListener(Landroid/view/View$OnClickListener;)Landroid/view/View$OnClickListener;
    .locals 2

    .line 1
    :try_start_0
    instance-of v0, p0, Lcom/tendcloud/dot/DotOnclickListener;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    new-instance v0, Lcom/tendcloud/dot/DotOnclickListener;

    .line 6
    .line 7
    move-object v1, p0

    .line 8
    check-cast v1, Lcom/tendcloud/dot/DotOnclickListener;

    .line 9
    .line 10
    invoke-direct {v1}, Lcom/tendcloud/dot/DotOnclickListener;->a()Landroid/view/View$OnClickListener;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    invoke-direct {v0, v1}, Lcom/tendcloud/dot/DotOnclickListener;-><init>(Landroid/view/View$OnClickListener;)V

    .line 15
    .line 16
    .line 17
    return-object v0

    .line 18
    :catchall_0
    move-exception v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lcom/tendcloud/dot/DotOnclickListener;

    .line 21
    .line 22
    invoke-direct {v0, p0}, Lcom/tendcloud/dot/DotOnclickListener;-><init>(Landroid/view/View$OnClickListener;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    .line 24
    .line 25
    return-object v0

    .line 26
    :goto_0
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 27
    .line 28
    .line 29
    return-object p0
.end method

.method public static setCallBack(Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;)V
    .locals 0

    .line 1
    sput-object p0, Lcom/tendcloud/dot/DotOnclickListener;->b:Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;

    .line 2
    .line 3
    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 1
    :try_start_0
    sget-object v0, Lcom/tendcloud/dot/DotOnclickListener;->b:Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    invoke-interface {v0, p1}, Lcom/tendcloud/dot/DotOnclickListener$DotClickCallBack;->onClick(Landroid/view/View;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    .line 7
    .line 8
    goto :goto_0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    invoke-static {v0}, Lcom/tendcloud/tenddata/ca;->eForInternal(Ljava/lang/Throwable;)V

    .line 11
    .line 12
    .line 13
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tendcloud/dot/DotOnclickListener;->a:Landroid/view/View$OnClickListener;

    .line 14
    .line 15
    if-eqz v0, :cond_1

    .line 16
    .line 17
    invoke-interface {v0, p1}, Landroid/view/View$OnClickListener;->onClick(Landroid/view/View;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    return-void
.end method
