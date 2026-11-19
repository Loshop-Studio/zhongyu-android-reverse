.class public final synthetic Lk/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lr6/e;


# instance fields
.field public final synthetic a:Z

.field public final synthetic b:Lr6/e;

.field public final synthetic c:I

.field public final synthetic d:I


# direct methods
.method public synthetic constructor <init>(ZLr6/e;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-boolean p1, p0, Lk/a;->a:Z

    iput-object p2, p0, Lk/a;->b:Lr6/e;

    iput p3, p0, Lk/a;->c:I

    iput p4, p0, Lk/a;->d:I

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    check-cast v4, Landroidx/compose/runtime/Composer;

    check-cast p2, Ljava/lang/Integer;

    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    move-result v5

    iget-boolean v0, p0, Lk/a;->a:Z

    iget-object v1, p0, Lk/a;->b:Lr6/e;

    iget v2, p0, Lk/a;->c:I

    iget v3, p0, Lk/a;->d:I

    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/internal/NavComposeUtils_androidKt;->a(ZLr6/e;IILandroidx/compose/runtime/Composer;I)Ld6/s;

    move-result-object p1

    return-object p1
.end method
