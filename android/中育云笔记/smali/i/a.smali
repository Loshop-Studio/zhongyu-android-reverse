.class public final synthetic Li/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/p;


# instance fields
.field public final synthetic c:Z

.field public final synthetic d:Lhd/p;

.field public final synthetic e:I

.field public final synthetic f:I


# direct methods
.method public synthetic constructor <init>(ZLhd/p;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Li/a;->c:Z

    iput-object p2, p0, Li/a;->d:Lhd/p;

    iput p3, p0, Li/a;->e:I

    iput p4, p0, Li/a;->f:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget-boolean v0, p0, Li/a;->c:Z

    iget-object v1, p0, Li/a;->d:Lhd/p;

    iget v2, p0, Li/a;->e:I

    iget v3, p0, Li/a;->f:I

    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/internal/NavComposeUtils_androidKt;->a(ZLhd/p;IILandroidx/compose/runtime/Composer;I)Lqc/q;

    move-result-object p1

    return-object p1
.end method
