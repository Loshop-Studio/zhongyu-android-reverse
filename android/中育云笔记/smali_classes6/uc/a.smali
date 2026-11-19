.class public final synthetic Luc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic c:[Lhd/l;


# direct methods
.method public synthetic constructor <init>([Lhd/l;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Luc/a;->c:[Lhd/l;

    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget-object v0, p0, Luc/a;->c:[Lhd/l;

    invoke-static {v0, p1, p2}, Luc/b;->a([Lhd/l;Ljava/lang/Object;Ljava/lang/Object;)I

    move-result p1

    return p1
.end method
