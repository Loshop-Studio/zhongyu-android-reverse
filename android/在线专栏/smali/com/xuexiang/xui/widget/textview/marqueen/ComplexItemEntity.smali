.class public Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private subTitle:Ljava/lang/String;

.field private time:Ljava/lang/String;

.field private title:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->title:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->subTitle:Ljava/lang/String;

    .line 4
    iput-object p3, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->time:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getSubTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->subTitle:Ljava/lang/String;

    return-object v0
.end method

.method public getTime()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->time:Ljava/lang/String;

    return-object v0
.end method

.method public getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->title:Ljava/lang/String;

    return-object v0
.end method

.method public setSubTitle(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->subTitle:Ljava/lang/String;

    return-object p0
.end method

.method public setTime(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->time:Ljava/lang/String;

    return-object p0
.end method

.method public setTitle(Ljava/lang/String;)Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->title:Ljava/lang/String;

    return-object p0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "\u4e3b\u6807\u9898:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->title:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", \u526f\u6807\u9898:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->subTitle:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", \u65f6\u95f4:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/textview/marqueen/ComplexItemEntity;->time:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
