.class public final synthetic Lu5/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic a:Landroid/view/Window;

.field public final synthetic b:Lu5/l;


# direct methods
.method public synthetic constructor <init>(Landroid/view/Window;Lu5/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lu5/j;->a:Landroid/view/Window;

    iput-object p2, p0, Lu5/j;->b:Lu5/l;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 2

    .line 1
    iget-object v0, p0, Lu5/j;->a:Landroid/view/Window;

    iget-object v1, p0, Lu5/j;->b:Lu5/l;

    invoke-static {v0, v1}, Lu5/l;->d(Landroid/view/Window;Lu5/l;)V

    return-void
.end method
