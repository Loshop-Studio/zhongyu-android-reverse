.class public final synthetic Lb2/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:Lcom/friday/common/camera/ImagePickFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/common/camera/ImagePickFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lb2/o;->a:Lcom/friday/common/camera/ImagePickFragment;

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget-object v0, p0, Lb2/o;->a:Lcom/friday/common/camera/ImagePickFragment;

    invoke-static {v0, p1, p2}, Lcom/friday/common/camera/ImagePickFragment;->v(Lcom/friday/common/camera/ImagePickFragment;Landroid/widget/CompoundButton;Z)V

    return-void
.end method
