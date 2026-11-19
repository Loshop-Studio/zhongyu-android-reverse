.class public final synthetic Landroidx/navigation/internal/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx7/a;


# instance fields
.field public final synthetic a:Lx7/a;


# direct methods
.method public synthetic constructor <init>(Lx7/a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/navigation/internal/p;->a:Lx7/a;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object v0, p0, Landroidx/navigation/internal/p;->a:Lx7/a;

    invoke-static {v0}, Landroidx/navigation/internal/NavControllerImpl;->h(Lx7/a;)Lh7/p;

    move-result-object v0

    return-object v0
.end method
