.class public final synthetic Ls6/z2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ls6/z2;->a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    iput-object p2, p0, Ls6/z2;->b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ls6/z2;->a:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;

    iget-object v1, p0, Ls6/z2;->b:Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;->f(Lcom/zykj/student/dialogue/ui/home/SessionListAdapter;Lcom/zykj/student/dialogue/ui/home/SessionListAdapter$ViewHolder;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
