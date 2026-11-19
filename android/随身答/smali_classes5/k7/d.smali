.class public final synthetic Lk7/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/zykj/view/ui/camera/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/view/ui/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lk7/d;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lk7/d;->a:Lcom/zykj/view/ui/camera/ImagePickFragment;

    invoke-static {v0, p1, p2}, Lcom/zykj/view/ui/camera/ImagePickFragment;->f(Lcom/zykj/view/ui/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
