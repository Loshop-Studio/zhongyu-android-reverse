.class public final Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;
    }
.end annotation


# instance fields
.field private className:Ljava/lang/Class;

.field private intent:Landroid/content/Intent;

.field private mContext:Landroid/app/Activity;

.field private videoClickListener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;


# direct methods
.method private constructor <init>(Landroid/app/Activity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    .line 3
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    return-void
.end method

.method public static from(Landroid/app/Activity;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 1

    .line 1
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method

.method public static from(Landroidx/fragment/app/Fragment;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 1

    .line 2
    new-instance v0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    invoke-direct {v0, p0}, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;-><init>(Landroid/app/Activity;)V

    return-object v0
.end method


# virtual methods
.method public setCurrentIndex(I)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_POSITION"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public setDrag(Z)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public setDrag(ZF)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_DRAG"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v0, "com.xuexiang.xui.widget.preview.KEY_SENSITIVITY"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;F)Landroid/content/Intent;

    return-object p0
.end method

.method public setDuration(I)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_DURATION"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public setFullscreen(Z)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_IS_FULLSCREEN"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public setImg(Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<E::",
            "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;",
            ">(TE;)",
            "Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;"
        }
    .end annotation

    .line 1
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 2
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

    invoke-virtual {p1, v1, v0}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    return-object p0
.end method

.method public setImgs(Ljava/util/List;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Lcom/xuexiang/xui/widget/imageview/preview/enitity/IPreviewInfo;",
            ">(",
            "Ljava/util/List<",
            "TT;>;)",
            "Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const-string p1, "com.xuexiang.xui.widget.preview.KEY_IMAGE_PATHS"

    invoke-virtual {v0, p1, v1}, Landroid/content/Intent;->putParcelableArrayListExtra(Ljava/lang/String;Ljava/util/ArrayList;)Landroid/content/Intent;

    return-object p0
.end method

.method public setOnVideoPlayerListener(Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 0

    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->videoClickListener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;

    return-object p0
.end method

.method public setPhotoFragment(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Class<",
            "+",
            "Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;",
            ">;)",
            "Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;"
        }
    .end annotation

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_CLASSNAME"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object p0
.end method

.method public setProgressColor(I)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_PROGRESS_COLOR"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    return-object p0
.end method

.method public setSingleFling(Z)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_SING_FILING"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public setSingleShowType(Z)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_IS_SHOW"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    return-object p0
.end method

.method public setType(Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder$IndicatorType;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    const-string v1, "com.xuexiang.xui.widget.preview.KEY_TYPE"

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    return-object p0
.end method

.method public start()V
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->className:Ljava/lang/Class;

    if-nez v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    const-class v2, Lcom/xuexiang/xui/widget/imageview/preview/ui/PreviewActivity;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    goto :goto_0

    .line 3
    :cond_0
    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    iget-object v2, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    invoke-virtual {v1, v2, v0}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    .line 4
    :goto_0
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->videoClickListener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;

    sput-object v0, Lcom/xuexiang/xui/widget/imageview/preview/ui/BasePhotoFragment;->listener:Lcom/xuexiang/xui/widget/imageview/preview/loader/OnVideoClickListener;

    .line 5
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    invoke-virtual {v0, v1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    .line 6
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    const/4 v1, 0x0

    invoke-virtual {v0, v1, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

    const/4 v0, 0x0

    .line 7
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    .line 8
    iput-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    return-void
.end method

.method public to(Ljava/lang/Class;)Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;
    .locals 2

    .line 1
    iput-object p1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->className:Ljava/lang/Class;

    .line 2
    iget-object v0, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->intent:Landroid/content/Intent;

    iget-object v1, p0, Lcom/xuexiang/xui/widget/imageview/preview/PreviewBuilder;->mContext:Landroid/app/Activity;

    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;

    return-object p0
.end method
