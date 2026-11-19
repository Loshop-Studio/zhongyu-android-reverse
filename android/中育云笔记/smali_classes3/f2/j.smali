.class public final synthetic Lf2/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;


# instance fields
.field public final synthetic c:Lf2/k;


# direct methods
.method public synthetic constructor <init>(Lf2/k;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lf2/j;->c:Lf2/k;

    return-void
.end method


# virtual methods
.method public final onGlobalLayout()V
    .locals 1

    .line 1
    iget-object v0, p0, Lf2/j;->c:Lf2/k;

    invoke-static {v0}, Lf2/k;->a(Lf2/k;)V

    return-void
.end method
