.class public final Lcom/zykj/evaluation/bean/PaperQuestion;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/compose/runtime/internal/StabilityInferred;
    parameters = 0x0
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u001a\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0087\u0008\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b\u0012\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\"\u001a\u00020\u0005H\u00c6\u0003J\t\u0010#\u001a\u00020\u0007H\u00c6\u0003J\t\u0010$\u001a\u00020\tH\u00c6\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000bH\u00c6\u0003J\u0011\u0010\'\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000bH\u00c6\u0003J\t\u0010(\u001a\u00020\u0003H\u00c6\u0003Jq\u0010)\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t2\u0010\u0008\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b2\u0010\u0008\u0002\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010*\u001a\u00020+2\u0008\u0010,\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010-\u001a\u00020\u0003H\u00d6\u0001J\t\u0010.\u001a\u00020\u0007H\u00d6\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0015R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u000c\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001dR\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u001dR\u001e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001dR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010\u0015\u00a8\u0006/"
    }
    d2 = {
        "Lcom/zykj/evaluation/bean/PaperQuestion;",
        "",
        "type",
        "",
        "id",
        "",
        "groupKey",
        "",
        "position",
        "Lcom/zykj/evaluation/bean/PaperPosition;",
        "selects",
        "",
        "Lcom/zykj/evaluation/bean/PaperSelect;",
        "blanks",
        "Lcom/zykj/evaluation/bean/PaperBlank;",
        "items",
        "Lcom/zykj/evaluation/bean/PaperHand;",
        "numericalOrder",
        "<init>",
        "(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V",
        "getType",
        "()I",
        "getId",
        "()J",
        "getGroupKey",
        "()Ljava/lang/String;",
        "getPosition",
        "()Lcom/zykj/evaluation/bean/PaperPosition;",
        "getSelects",
        "()Ljava/util/List;",
        "getBlanks",
        "getItems",
        "getNumericalOrder",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "app_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I = 0x8


# instance fields
.field private final blanks:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Blanks"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperBlank;",
            ">;"
        }
    .end annotation
.end field

.field private final groupKey:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "GroupKey"
    .end annotation
.end field

.field private final id:J
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Id"
    .end annotation
.end field

.field private final items:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Items"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperHand;",
            ">;"
        }
    .end annotation
.end field

.field private final numericalOrder:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "NumericalOrder"
    .end annotation
.end field

.field private final position:Lcom/zykj/evaluation/bean/PaperPosition;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Position"
    .end annotation
.end field

.field private final selects:Ljava/util/List;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Selects"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperSelect;",
            ">;"
        }
    .end annotation
.end field

.field private final type:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "Type"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "Lcom/zykj/evaluation/bean/PaperPosition;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperSelect;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperBlank;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperHand;",
            ">;I)V"
        }
    .end annotation

    .line 1
    const-string v0, "groupKey"

    .line 2
    .line 3
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "position"

    .line 7
    .line 8
    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput p1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    .line 15
    .line 16
    iput-wide p2, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    .line 17
    .line 18
    iput-object p4, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    .line 19
    .line 20
    iput-object p5, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    .line 21
    .line 22
    iput-object p6, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    .line 23
    .line 24
    iput-object p7, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    .line 25
    .line 26
    iput-object p8, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    .line 27
    .line 28
    iput p9, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    .line 29
    .line 30
    return-void
.end method

.method public static synthetic copy$default(Lcom/zykj/evaluation/bean/PaperQuestion;IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;IILjava/lang/Object;)Lcom/zykj/evaluation/bean/PaperQuestion;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-wide p2, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-object p4, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-object p5, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    :cond_3
    and-int/lit8 p11, p10, 0x10

    if-eqz p11, :cond_4

    iget-object p6, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    :cond_4
    and-int/lit8 p11, p10, 0x20

    if-eqz p11, :cond_5

    iget-object p7, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    :cond_5
    and-int/lit8 p11, p10, 0x40

    if-eqz p11, :cond_6

    iget-object p8, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    :cond_6
    and-int/lit16 p10, p10, 0x80

    if-eqz p10, :cond_7

    iget p9, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    :cond_7
    move-object p10, p8

    move p11, p9

    move-object p8, p6

    move-object p9, p7

    move-object p6, p4

    move-object p7, p5

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/zykj/evaluation/bean/PaperQuestion;->copy(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)Lcom/zykj/evaluation/bean/PaperQuestion;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    return v0
.end method

.method public final component2()J
    .locals 2

    iget-wide v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    return-wide v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Lcom/zykj/evaluation/bean/PaperPosition;
    .locals 1

    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    return-object v0
.end method

.method public final component5()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperSelect;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    return-object v0
.end method

.method public final component6()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperBlank;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    return-object v0
.end method

.method public final component7()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperHand;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    return-object v0
.end method

.method public final component8()I
    .locals 1

    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    return v0
.end method

.method public final copy(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)Lcom/zykj/evaluation/bean/PaperQuestion;
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Ljava/lang/String;",
            "Lcom/zykj/evaluation/bean/PaperPosition;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperSelect;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperBlank;",
            ">;",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperHand;",
            ">;I)",
            "Lcom/zykj/evaluation/bean/PaperQuestion;"
        }
    .end annotation

    const-string v0, "groupKey"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "position"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/zykj/evaluation/bean/PaperQuestion;

    move v2, p1

    move-wide v3, p2

    move-object v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p9

    invoke-direct/range {v1 .. v10}, Lcom/zykj/evaluation/bean/PaperQuestion;-><init>(IJLjava/lang/String;Lcom/zykj/evaluation/bean/PaperPosition;Ljava/util/List;Ljava/util/List;Ljava/util/List;I)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/zykj/evaluation/bean/PaperQuestion;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/zykj/evaluation/bean/PaperQuestion;

    iget v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    iget v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    iget-wide v5, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    iget-object v3, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    iget p1, p1, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getBlanks()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperBlank;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getGroupKey()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getItems()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperHand;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNumericalOrder()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    .line 2
    .line 3
    return v0
.end method

.method public final getPosition()Lcom/zykj/evaluation/bean/PaperPosition;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getSelects()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/zykj/evaluation/bean/PaperSelect;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getType()I
    .locals 1

    .line 1
    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    .line 2
    .line 3
    return v0
.end method

.method public hashCode()I
    .locals 3

    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    mul-int/lit8 v0, v0, 0x1f

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    invoke-virtual {v1}, Lcom/zykj/evaluation/bean/PaperPosition;->hashCode()I

    move-result v1

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    const/4 v2, 0x0

    if-nez v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_0
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    if-nez v1, :cond_1

    move v1, v2

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_1
    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    iget-object v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    iget v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->type:I

    iget-wide v1, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->id:J

    iget-object v3, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->groupKey:Ljava/lang/String;

    iget-object v4, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->position:Lcom/zykj/evaluation/bean/PaperPosition;

    iget-object v5, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->selects:Ljava/util/List;

    iget-object v6, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->blanks:Ljava/util/List;

    iget-object v7, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->items:Ljava/util/List;

    iget v8, p0, Lcom/zykj/evaluation/bean/PaperQuestion;->numericalOrder:I

    new-instance v9, Ljava/lang/StringBuilder;

    invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V

    const-string v10, "PaperQuestion(type="

    invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", id="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ", groupKey="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", position="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", selects="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", blanks="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", items="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", numericalOrder="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
