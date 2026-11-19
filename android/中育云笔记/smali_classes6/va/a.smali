.class public final synthetic Lva/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/l;


# instance fields
.field public final synthetic c:Lcom/zykj/cloudhelper/fragment/PickNoteFragment;


# direct methods
.method public synthetic constructor <init>(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lva/a;->c:Lcom/zykj/cloudhelper/fragment/PickNoteFragment;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Lva/a;->c:Lcom/zykj/cloudhelper/fragment/PickNoteFragment;

    check-cast p1, Ljava/util/LinkedHashMap;

    invoke-static {v0, p1}, Lcom/zykj/cloudhelper/fragment/PickNoteFragment;->y(Lcom/zykj/cloudhelper/fragment/PickNoteFragment;Ljava/util/LinkedHashMap;)Lqc/q;

    move-result-object p1

    return-object p1
.end method
