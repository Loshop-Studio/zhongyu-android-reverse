.class public final synthetic Lz2/p0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic c:Lhd/p;


# direct methods
.method public synthetic constructor <init>(Lhd/p;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lz2/p0;->c:Lhd/p;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Lz2/p0;->c:Lhd/p;

    invoke-static {v0, p1, p2}, Lcom/friday/document/viewmodel/StudentShareViewModel;->f(Lhd/p;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
