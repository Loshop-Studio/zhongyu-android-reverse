.class public final synthetic Lc2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/zykj/subscriber/FileActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/subscriber/FileActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc2/d;->a:Lcom/zykj/subscriber/FileActivity;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    iget-object v0, p0, Lc2/d;->a:Lcom/zykj/subscriber/FileActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/subscriber/FileActivity;->g(Lcom/zykj/subscriber/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
