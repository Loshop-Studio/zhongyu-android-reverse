.class public final Ll8/u$c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Ll8/u;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ll8/u$c$a;
    }
.end annotation


# static fields
.field public static final c:Ll8/u$c$a;


# instance fields
.field public final a:Ll8/q;

.field public final b:Ll8/x;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ll8/u$c$a;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Ll8/u$c$a;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Ll8/u$c;->c:Ll8/u$c$a;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>(Ll8/q;Ll8/x;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Ll8/u$c;->a:Ll8/q;

    .line 4
    iput-object p2, p0, Ll8/u$c;->b:Ll8/x;

    return-void
.end method

.method public synthetic constructor <init>(Ll8/q;Ll8/x;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Ll8/u$c;-><init>(Ll8/q;Ll8/x;)V

    return-void
.end method


# virtual methods
.method public final a()Ll8/x;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/u$c;->b:Ll8/x;

    .line 2
    .line 3
    return-object v0
.end method

.method public final b()Ll8/q;
    .locals 1

    .line 1
    iget-object v0, p0, Ll8/u$c;->a:Ll8/q;

    .line 2
    .line 3
    return-object v0
.end method
