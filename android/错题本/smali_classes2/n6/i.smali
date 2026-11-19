.class public final Ln6/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz6/h;


# instance fields
.field public final a:Ljava/io/File;

.field public final b:Lkotlin/io/FileWalkDirection;

.field public final c:Lr6/e;


# direct methods
.method public constructor <init>(Ljava/io/File;Lkotlin/io/FileWalkDirection;Lkotlin/io/b;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ln6/i;->a:Ljava/io/File;

    .line 5
    .line 6
    iput-object p2, p0, Ln6/i;->b:Lkotlin/io/FileWalkDirection;

    .line 7
    .line 8
    iput-object p3, p0, Ln6/i;->c:Lr6/e;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final iterator()Ljava/util/Iterator;
    .locals 1

    .line 1
    new-instance v0, Ln6/g;

    .line 2
    .line 3
    invoke-direct {v0, p0}, Ln6/g;-><init>(Ln6/i;)V

    .line 4
    .line 5
    .line 6
    return-object v0
.end method
