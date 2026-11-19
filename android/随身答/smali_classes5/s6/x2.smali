.class public final synthetic Ls6/x2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/x2;->a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    iput-object p2, p0, Ls6/x2;->b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/x2;->a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    iget-object v1, p0, Ls6/x2;->b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;->b(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;Landroid/view/View;)Z

    move-result p1

    return p1
.end method
