.class public final synthetic Lcom/zykj/mistake/feature/notebook/detail/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:J

.field public final synthetic c:J

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;JJI)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->a:Ljava/lang/String;

    iput-wide p2, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->b:J

    iput-wide p4, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->c:J

    iput p6, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Landroidx/compose/runtime/Composer;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->d:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Landroidx/compose/runtime/RecomposeScopeImplKt;->updateChangedFlags(I)I

    .line 14
    .line 15
    .line 16
    move-result v6

    .line 17
    iget-object v0, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->a:Ljava/lang/String;

    .line 18
    .line 19
    iget-wide v1, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->b:J

    .line 20
    .line 21
    iget-wide v3, p0, Lcom/zykj/mistake/feature/notebook/detail/r;->c:J

    .line 22
    .line 23
    invoke-static/range {v0 .. v6}, Lcom/zykj/mistake/feature/notebook/detail/t;->u(Ljava/lang/String;JJLandroidx/compose/runtime/Composer;I)V

    .line 24
    .line 25
    .line 26
    sget-object p1, Ld6/s;->a:Ld6/s;

    .line 27
    .line 28
    return-object p1
.end method
