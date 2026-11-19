.class public final synthetic Landroidx/navigation/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lhd/a;


# instance fields
.field public final synthetic c:Lhd/a;


# direct methods
.method public synthetic constructor <init>(Lhd/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/p;->c:Lhd/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/p;->c:Lhd/a;

    invoke-static {v0}, Landroidx/navigation/internal/NavControllerImpl;->h(Lhd/a;)Lqc/q;

    move-result-object v0

    return-object v0
.end method
