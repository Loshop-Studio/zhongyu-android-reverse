.class public final synthetic Ln6/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public final synthetic a:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;

.field public final synthetic b:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter$MyViewHolder;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter$MyViewHolder;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ln6/l;->a:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;

    iput-object p2, p0, Ln6/l;->b:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter$MyViewHolder;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Ln6/l;->a:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;

    iget-object v1, p0, Ln6/l;->b:Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter$MyViewHolder;

    check-cast p1, Landroid/view/View;

    invoke-static {v0, v1, p1}, Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;->b(Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter;Lcom/zykj/student/dialogue/ui/collect/CollectListAdapter$MyViewHolder;Landroid/view/View;)Lkotlin/Unit;

    move-result-object p1

    return-object p1
.end method
