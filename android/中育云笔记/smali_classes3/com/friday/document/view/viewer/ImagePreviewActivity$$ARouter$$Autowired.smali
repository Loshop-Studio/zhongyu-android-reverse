.class public Lcom/friday/document/view/viewer/ImagePreviewActivity$$ARouter$$Autowired;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/alibaba/android/arouter/facade/template/ISyringe;


# instance fields
.field private serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public inject(Ljava/lang/Object;)V
    .locals 3

    .line 1
    invoke-static {}, Lcom/alibaba/android/arouter/launcher/ARouter;->getInstance()Lcom/alibaba/android/arouter/launcher/ARouter;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    const-class v1, Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/alibaba/android/arouter/launcher/ARouter;->navigation(Ljava/lang/Class;)Ljava/lang/Object;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    check-cast v0, Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/friday/document/view/viewer/ImagePreviewActivity$$ARouter$$Autowired;->serializationService:Lcom/alibaba/android/arouter/facade/service/SerializationService;

    .line 14
    .line 15
    check-cast p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;

    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 22
    .line 23
    .line 24
    move-result-object v0

    .line 25
    if-nez v0, :cond_0

    .line 26
    .line 27
    iget-object v0, p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_0
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 31
    .line 32
    .line 33
    move-result-object v0

    .line 34
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 35
    .line 36
    .line 37
    move-result-object v0

    .line 38
    const-string v1, "imageUrl"

    .line 39
    .line 40
    iget-object v2, p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 41
    .line 42
    invoke-virtual {v0, v1, v2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    iput-object v0, p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;->g:Ljava/lang/String;

    .line 47
    .line 48
    invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 49
    .line 50
    .line 51
    move-result-object v0

    .line 52
    const-string v1, "isStudentShare"

    .line 53
    .line 54
    iget-boolean v2, p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;->h:Z

    .line 55
    .line 56
    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 57
    .line 58
    .line 59
    move-result v0

    .line 60
    iput-boolean v0, p1, Lcom/friday/document/view/viewer/ImagePreviewActivity;->h:Z

    .line 61
    .line 62
    return-void
.end method
