.class public Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public imgUrl:Ljava/lang/String;

.field public title:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getImgUrl()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->imgUrl:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setImgUrl(Ljava/lang/String;)Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->imgUrl:Ljava/lang/String;

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/banner/widget/banner/BannerItem;->title:Ljava/lang/String;

    return-object p0
.end method
