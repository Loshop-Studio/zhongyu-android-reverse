.class public Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field private mColorNormal:I

.field private mColorSelected:I

.field private mContent:Ljava/lang/String;

.field private mTitleTextSize:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const v0, -0xbf7f

    .line 2
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorSelected:I

    const v0, -0x8a8a8b

    .line 3
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorNormal:I

    const/16 v0, 0x10

    .line 4
    iput v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mTitleTextSize:I

    const-string v0, ""

    .line 5
    iput-object v0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mContent:Ljava/lang/String;

    return-void
.end method

.method static synthetic access$1000(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mContent:Ljava/lang/String;

    return-object p0
.end method

.method static synthetic access$700(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorSelected:I

    return p0
.end method

.method static synthetic access$800(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorNormal:I

    return p0
.end method

.method static synthetic access$900(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;)I
    .locals 0

    iget p0, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mTitleTextSize:I

    return p0
.end method


# virtual methods
.method public build()Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;
    .locals 2

    new-instance v0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle;-><init>(Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$1;)V

    return-object v0
.end method

.method public setContent(Ljava/lang/String;)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mContent:Ljava/lang/String;

    return-object p0
.end method

.method public setTextColor(II)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;
    .locals 0

    .line 1
    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorSelected:I

    .line 2
    iput p2, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mColorNormal:I

    return-object p0
.end method

.method public setTextSize(I)Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;
    .locals 0

    iput p1, p0, Lcom/xuexiang/xui/widget/tabbar/vertical/ITabView$TabTitle$Builder;->mTitleTextSize:I

    return-object p0
.end method
