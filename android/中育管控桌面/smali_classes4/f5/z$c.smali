.class public final Lf5/z$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lf5/z;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lf5/z$c$a;
    }
.end annotation


# static fields
.field public static final c:Lf5/z$c$a;


# instance fields
.field public final a:Lf5/v;

.field public final b:Lf5/c0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lf5/z$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lf5/z$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lf5/z$c;->c:Lf5/z$c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Lf5/v;Lf5/c0;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lf5/z$c;->a:Lf5/v;

    .line 4
    iput-object p2, p0, Lf5/z$c;->b:Lf5/c0;

    return-void
.end method

.method public synthetic constructor <init>(Lf5/v;Lf5/c0;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lf5/z$c;-><init>(Lf5/v;Lf5/c0;)V

    return-void
.end method


# virtual methods
.method public final a()Lf5/c0;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/z$c;->b:Lf5/c0;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Lf5/v;
    .locals 1

    .line 1
    iget-object v0, p0, Lf5/z$c;->a:Lf5/v;

    .line 2
    .line 3
    return-object v0
.end method
