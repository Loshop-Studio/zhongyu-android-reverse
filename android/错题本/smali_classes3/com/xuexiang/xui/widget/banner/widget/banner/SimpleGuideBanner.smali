.class public Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;
.super Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner<",
        "Ljava/lang/Object;",
        "Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;",
        ">;"
    }
.end annotation


# instance fields
.field public L:La2/b;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:Z

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 0

    .line 4
    invoke-direct {p0, p1, p2}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    const/4 p1, 0x1

    .line 5
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:Z

    const/4 p1, 0x0

    .line 6
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:Z

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 0

    .line 7
    invoke-direct {p0, p1, p2, p3}, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseIndicatorBanner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    const/4 p1, 0x1

    .line 8
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->q:Z

    const/4 p1, 0x0

    .line 9
    iput-boolean p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/base/BaseBanner;->j:Z

    return-void
.end method


# virtual methods
.method public setOnJumpClickListener(La2/b;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/SimpleGuideBanner;->L:La2/b;

    .line 2
    .line 3
    return-void
.end method
