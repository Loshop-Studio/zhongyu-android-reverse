.class public final synthetic Lz3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/TextView$OnEditorActionListener;


# instance fields
.field public final synthetic a:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz3/c;->a:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;

    return-void
.end method


# virtual methods
.method public final onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lz3/c;->a:Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;

    invoke-static {v0, p1, p2, p3}, Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;->n(Lcom/zykj/huiwei/launcher/ui/activity/FileActivity;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z

    move-result p1

    return p1
.end method
