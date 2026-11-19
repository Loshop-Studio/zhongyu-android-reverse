.class public Ls1/m$b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ls1/m;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "b"
.end annotation


# instance fields
.field public final synthetic c:Ls1/m;


# direct methods
.method public constructor <init>(Ls1/m;)V
    .locals 0

    .line 1
    iput-object p1, p0, Ls1/m$b;->c:Ls1/m;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ls1/m;Ls1/m$a;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Ls1/m$b;-><init>(Ls1/m;)V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 1

    .line 1
    iget-object v0, p0, Ls1/m$b;->c:Ls1/m;

    .line 2
    .line 3
    invoke-static {v0}, Ls1/m;->a(Ls1/m;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method
