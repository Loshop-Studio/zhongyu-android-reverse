.class public final synthetic Lcom/zykj/mistake/main/drawer/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/compose/runtime/snapshots/SnapshotStateList;


# direct methods
.method public synthetic constructor <init>(Landroidx/compose/runtime/snapshots/SnapshotStateList;I)V
    .locals 0

    .line 1
    iput p2, p0, Lcom/zykj/mistake/main/drawer/i;->a:I

    iput-object p1, p0, Lcom/zykj/mistake/main/drawer/i;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/mistake/main/drawer/i;->a:I

    .line 2
    .line 3
    check-cast p1, Lcom/zykj/mistake/entity/resp/CustomTagInfo;

    .line 4
    .line 5
    check-cast p2, Ljava/lang/Boolean;

    .line 6
    .line 7
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 8
    .line 9
    .line 10
    move-result p2

    .line 11
    packed-switch v0, :pswitch_data_0

    .line 12
    .line 13
    .line 14
    const-string v0, "tag"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/i;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 20
    .line 21
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/main/drawer/l;->g(Ljava/util/List;Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)V

    .line 22
    .line 23
    .line 24
    :goto_0
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 25
    .line 26
    return-object p1

    .line 27
    :pswitch_0
    const-string v0, "tag"

    .line 28
    .line 29
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/i;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 33
    .line 34
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/main/drawer/l;->g(Ljava/util/List;Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_1
    const-string v0, "tag"

    .line 39
    .line 40
    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v0, p0, Lcom/zykj/mistake/main/drawer/i;->b:Landroidx/compose/runtime/snapshots/SnapshotStateList;

    .line 44
    .line 45
    invoke-static {v0, p1, p2}, Lcom/zykj/mistake/main/drawer/l;->g(Ljava/util/List;Lcom/zykj/mistake/entity/resp/CustomTagInfo;Z)V

    .line 46
    .line 47
    .line 48
    goto :goto_0

    .line 49
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
