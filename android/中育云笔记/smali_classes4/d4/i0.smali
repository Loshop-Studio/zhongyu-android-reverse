.class public final synthetic Ld4/i0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroidx/activity/result/ActivityResultCallback;


# instance fields
.field public final synthetic a:Lcom/friday/paint/view/six/NewPaintFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/friday/paint/view/six/NewPaintFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ld4/i0;->a:Lcom/friday/paint/view/six/NewPaintFragment;

    return-void
.end method


# virtual methods
.method public final onActivityResult(Ljava/lang/Object;)V
    .locals 1

    .line 1
    iget-object v0, p0, Ld4/i0;->a:Lcom/friday/paint/view/six/NewPaintFragment;

    check-cast p1, Landroidx/activity/result/ActivityResult;

    invoke-static {v0, p1}, Lcom/friday/paint/view/six/NewPaintFragment;->C(Lcom/friday/paint/view/six/NewPaintFragment;Landroidx/activity/result/ActivityResult;)V

    return-void
.end method
