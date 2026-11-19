.class public final synthetic Lc5/h0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lx7/l;

.field public final synthetic b:Landroidx/compose/runtime/MutableState;


# direct methods
.method public synthetic constructor <init>(Lx7/l;Landroidx/compose/runtime/MutableState;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lc5/h0;->a:Lx7/l;

    iput-object p2, p0, Lc5/h0;->b:Landroidx/compose/runtime/MutableState;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 2

    .line 1
    iget-object v0, p0, Lc5/h0;->a:Lx7/l;

    iget-object v1, p0, Lc5/h0;->b:Landroidx/compose/runtime/MutableState;

    invoke-static {v0, v1}, Lc5/j0;->c(Lx7/l;Landroidx/compose/runtime/MutableState;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
