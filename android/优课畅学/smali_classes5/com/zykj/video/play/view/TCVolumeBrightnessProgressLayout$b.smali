.class public Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic a:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;


# direct methods
.method public constructor <init>(Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;-><init>(Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout$b;->a:Lcom/zykj/video/play/view/TCVolumeBrightnessProgressLayout;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 6
    .line 7
    .line 8
    return-void
.end method
