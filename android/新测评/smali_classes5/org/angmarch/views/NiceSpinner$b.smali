.class public Lorg/angmarch/views/NiceSpinner$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/PopupWindow$OnDismissListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/angmarch/views/NiceSpinner;->o(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lorg/angmarch/views/NiceSpinner;


# direct methods
.method public constructor <init>(Lorg/angmarch/views/NiceSpinner;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lorg/angmarch/views/NiceSpinner$b;->a:Lorg/angmarch/views/NiceSpinner;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onDismiss()V
    .locals 2

    .line 1
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner$b;->a:Lorg/angmarch/views/NiceSpinner;

    .line 2
    .line 3
    invoke-static {v0}, Lorg/angmarch/views/NiceSpinner;->i(Lorg/angmarch/views/NiceSpinner;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iget-object v0, p0, Lorg/angmarch/views/NiceSpinner$b;->a:Lorg/angmarch/views/NiceSpinner;

    .line 10
    .line 11
    const/4 v1, 0x0

    .line 12
    invoke-static {v0, v1}, Lorg/angmarch/views/NiceSpinner;->j(Lorg/angmarch/views/NiceSpinner;Z)V

    .line 13
    .line 14
    .line 15
    :cond_0
    return-void
.end method
