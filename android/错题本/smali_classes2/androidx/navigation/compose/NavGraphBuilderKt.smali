.class public final Landroidx/navigation/compose/NavGraphBuilderKt;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aT\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u000bH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u0087\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122\"\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0012H\u0007\u00a2\u0006\u0004\u0008\r\u0010\u001a\u001a\u00af\u0002\u0010\r\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122\"\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008\r\u0010\u001d\u001a\u00c7\u0002\u0010\r\u001a\u00020\n\"\n\u0008\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\n\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122$\u0008\u0008\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0012H\u0086\u0008\u00a2\u0006\u0004\u0008\r\u0010$\u001a\u00ce\u0002\u0010\r\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000%2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\"\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0018\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008\r\u0010&\u001a\\\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010\'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012H\u0007\u00a2\u0006\u0004\u0008)\u0010*\u001a\u00f0\u0001\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010\'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032#\u0008\u0002\u0010\u0013\u001a\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122#\u0008\u0002\u0010\u0015\u001a\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122#\u0008\u0002\u0010\u0016\u001a\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122#\u0008\u0002\u0010\u0017\u001a\u001d\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012H\u0007\u00a2\u0006\u0004\u0008)\u0010+\u001a\u00ac\u0002\u0010)\u001a\u00020\n*\u00020\u00002\u0006\u0010\'\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u001b\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u0011\u00a2\u0006\u0002\u0008\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008)\u0010,\u001a\u00c8\u0002\u0010)\u001a\u00020\n\"\n\u0008\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\n\u0010\'\u001a\u0006\u0012\u0002\u0008\u00030%2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\n\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\u0019\u0008\u0008\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012H\u0086\u0008\u00a2\u0006\u0004\u0008)\u0010-\u001a\u00cf\u0002\u0010)\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\n\u0010\'\u001a\u0006\u0012\u0002\u0008\u00030%2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000%2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008)\u0010.\u001a\u00c4\u0002\u0010)\u001a\u00020\n\"\n\u0008\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u0006\u0010\'\u001a\u00020\u001e2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\n\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\n\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\u0019\u0008\u0008\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012H\u0086\u0008\u00a2\u0006\u0004\u0008)\u0010/\u001a\u00cb\u0002\u0010)\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\u0006\u0010\'\u001a\u00020\u001e2\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000%2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032(\u0008\u0002\u0010\u0013\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0015\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0016\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0010\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u0017\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u0014\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122(\u0008\u0002\u0010\u001c\u001a\"\u0012\n\u0012\u0008\u0012\u0004\u0012\u00020\t0\u000f\u0012\u000b\u0012\t\u0018\u00010\u001b\u00a2\u0006\u0002\u0008\u0011\u0018\u00010\u0008\u00a2\u0006\u0002\u0008\u00122\u0017\u0010(\u001a\u0013\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u0012\u00a2\u0006\u0004\u0008)\u00100\u001a\\\u00103\u001a\u00020\n*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0002\u00102\u001a\u0002012\u0017\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0004\u00083\u00104\u001at\u00103\u001a\u00020\n\"\n\u0008\u0000\u0010\u001f\u0018\u0001*\u00020\u001e*\u00020\u00002\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0002\u00102\u001a\u0002012\u0019\u0008\u0008\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u000bH\u0086\u0008\u00a2\u0006\u0004\u00083\u00105\u001a{\u00103\u001a\u00020\n\"\u0008\u0008\u0000\u0010\u001f*\u00020\u001e*\u00020\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00028\u00000%2\u001d\u0008\u0002\u0010#\u001a\u0017\u0012\u0004\u0012\u00020!\u0012\r\u0012\u000b\u0012\u0002\u0008\u00030\"\u00a2\u0006\u0002\u0008\u00110 2\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00032\u0008\u0008\u0002\u00102\u001a\u0002012\u0017\u0010\u000c\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0008\u00a2\u0006\u0002\u0008\u000b\u00a2\u0006\u0004\u00083\u00106\u00a8\u00067"
    }
    d2 = {
        "Landroidx/navigation/NavGraphBuilder;",
        "",
        "route",
        "",
        "Landroidx/navigation/NamedNavArgument;",
        "arguments",
        "Landroidx/navigation/NavDeepLink;",
        "deepLinks",
        "Lkotlin/Function1;",
        "Landroidx/navigation/NavBackStackEntry;",
        "Ld6/s;",
        "Landroidx/compose/runtime/Composable;",
        "content",
        "composable",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/f;)V",
        "Landroidx/compose/animation/AnimatedContentTransitionScope;",
        "Landroidx/compose/animation/EnterTransition;",
        "Lkotlin/jvm/JvmSuppressWildcards;",
        "Lkotlin/ExtensionFunctionType;",
        "enterTransition",
        "Landroidx/compose/animation/ExitTransition;",
        "exitTransition",
        "popEnterTransition",
        "popExitTransition",
        "Lkotlin/Function2;",
        "Landroidx/compose/animation/AnimatedContentScope;",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "Landroidx/compose/animation/SizeTransform;",
        "sizeTransform",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "",
        "T",
        "",
        "Ly6/q;",
        "Landroidx/navigation/NavType;",
        "typeMap",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "Ly6/c;",
        "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V",
        "startDestination",
        "builder",
        "navigation",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V",
        "Landroidx/compose/ui/window/DialogProperties;",
        "dialogProperties",
        "dialog",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V",
        "(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V",
        "navigation-compose_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n+ 2 NavigatorProvider.android.kt\nandroidx/navigation/NavigatorProviderKt__NavigatorProvider_androidKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,736:1\n115#2:737\n115#2:742\n115#2:747\n115#2:752\n115#2:763\n115#2:768\n1863#3,2:738\n1863#3,2:740\n1863#3,2:743\n1863#3,2:745\n1863#3,2:748\n1863#3,2:750\n1863#3,2:753\n1863#3,2:755\n1863#3,2:757\n1863#3,2:759\n1863#3,2:761\n1863#3,2:764\n1863#3,2:766\n1863#3,2:770\n1#4:769\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/compose/NavGraphBuilderKt\n*L\n56#1:737\n106#1:742\n158#1:747\n265#1:752\n669#1:763\n727#1:768\n59#1:738,2\n62#1:740,2\n108#1:743,2\n109#1:745,2\n160#1:748,2\n161#1:750,2\n271#1:753,2\n400#1:755,2\n401#1:757,2\n518#1:759,2\n635#1:761,2\n675#1:764,2\n676#1:766,2\n733#1:770,2\n*E\n"
    }
.end annotation


# direct methods
.method public static final composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 3
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/g;",
            ")V"
        }
    .end annotation

    .line 22
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 23
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 24
    invoke-direct {v0, v1, p1, p9}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lr6/g;)V

    .line 25
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p9

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 26
    invoke-virtual {v0, p9, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 27
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 28
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 29
    :cond_1
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lr6/c;)V

    .line 30
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lr6/c;)V

    .line 31
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lr6/c;)V

    .line 32
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lr6/c;)V

    .line 33
    invoke-virtual {v0, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setSizeTransform(Lr6/c;)V

    .line 34
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final synthetic composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 3
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of composable builder that supports sizeTransform"
    .end annotation

    .line 10
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 11
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 12
    invoke-direct {v0, v1, p1, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Ljava/lang/String;Lr6/g;)V

    .line 13
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p8

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 14
    invoke-virtual {v0, p8, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 15
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 16
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 17
    :cond_1
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lr6/c;)V

    .line 18
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lr6/c;)V

    .line 19
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lr6/c;)V

    .line 20
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lr6/c;)V

    .line 21
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final synthetic composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/f;)V
    .locals 4
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of composable builder that supports AnimatedContent"
    .end annotation

    .line 1
    new-instance v0, Landroidx/navigation/compose/ComposeNavigator$Destination;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 2
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 3
    new-instance v2, Landroidx/navigation/compose/NavGraphBuilderKt$composable$1;

    invoke-direct {v2, p4}, Landroidx/navigation/compose/NavGraphBuilderKt$composable$1;-><init>(Lr6/f;)V

    const p4, -0x5a6902e9

    const/4 v3, 0x1

    invoke-static {p4, v3, v2}, Landroidx/compose/runtime/internal/ComposableLambdaKt;->composableLambdaInstance(IZLjava/lang/Object;)Landroidx/compose/runtime/internal/ComposableLambda;

    move-result-object p4

    invoke-direct {v0, v1, p4}, Landroidx/navigation/compose/ComposeNavigator$Destination;-><init>(Landroidx/navigation/compose/ComposeNavigator;Lr6/g;)V

    .line 4
    invoke-virtual {v0, p1}, Landroidx/navigation/NavDestination;->setRoute(Ljava/lang/String;)V

    .line 5
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 6
    invoke-virtual {v0, p4, p2}, Landroidx/navigation/NavDestination;->addArgument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 7
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 8
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 9
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final composable(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 0
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/g;",
            ")V"
        }
    .end annotation

    .line 35
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V
    .locals 3
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/g;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/g;",
            ")V"
        }
    .end annotation

    .line 36
    new-instance v0, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;

    .line 37
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/ComposeNavigator;

    .line 38
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/ComposeNavigator;

    .line 39
    invoke-direct {v0, v1, p1, p2, p9}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/ComposeNavigator;Ly6/c;Ljava/util/Map;Lr6/g;)V

    .line 40
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 41
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 42
    :cond_0
    invoke-virtual {v0, p4}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setEnterTransition(Lr6/c;)V

    .line 43
    invoke-virtual {v0, p5}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setExitTransition(Lr6/c;)V

    .line 44
    invoke-virtual {v0, p6}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopEnterTransition(Lr6/c;)V

    .line 45
    invoke-virtual {v0, p7}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setPopExitTransition(Lr6/c;)V

    .line 46
    invoke-virtual {v0, p8}, Landroidx/navigation/compose/ComposeNavigatorDestinationBuilder;->setSizeTransform(Lr6/c;)V

    .line 47
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 1
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 2
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, v0, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v8, p3

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v9, p9

    goto :goto_5

    :cond_6
    move-object/from16 v8, p8

    goto :goto_4

    .line 3
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 9

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_0

    .line 4
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p9, 0x4

    if-eqz p2, :cond_1

    .line 5
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p9, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, p9, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, p9, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object v6, p6

    :goto_2
    and-int/lit8 p2, p9, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    :goto_3
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v8, p8

    goto :goto_4

    :cond_5
    move-object/from16 v7, p7

    goto :goto_3

    .line 6
    :goto_4
    invoke-static/range {v0 .. v8}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/f;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 7
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    .line 8
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 9
    :cond_1
    invoke-static {p0, p1, p2, p3, p4}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/f;)V

    return-void
.end method

.method public static composable$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p0, p9, 0x1

    if-eqz p0, :cond_0

    .line 10
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    :cond_0
    and-int/lit8 p0, p9, 0x2

    if-eqz p0, :cond_1

    .line 11
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 12
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static composable$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, v0, 0x4

    if-eqz p2, :cond_1

    .line 14
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, v0, 0x8

    const/4 p3, 0x0

    if-eqz p2, :cond_2

    move-object v4, p3

    goto :goto_0

    :cond_2
    move-object v4, p4

    :goto_0
    and-int/lit8 p2, v0, 0x10

    if-eqz p2, :cond_3

    move-object v5, p3

    goto :goto_1

    :cond_3
    move-object v5, p5

    :goto_1
    and-int/lit8 p2, v0, 0x20

    if-eqz p2, :cond_4

    move-object v6, v4

    goto :goto_2

    :cond_4
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p2, v0, 0x40

    if-eqz p2, :cond_5

    move-object v7, v5

    goto :goto_3

    :cond_5
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p2, v0, 0x80

    if-eqz p2, :cond_6

    move-object v8, p3

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object/from16 v9, p9

    goto :goto_5

    :cond_6
    move-object/from16 v8, p8

    goto :goto_4

    .line 15
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->composable(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/g;)V

    return-void
.end method

.method public static final dialog(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V
    .locals 3
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/window/DialogProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lr6/f;",
            ")V"
        }
    .end annotation

    .line 2
    new-instance v0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;

    .line 3
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/DialogNavigator;

    .line 4
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/DialogNavigator;

    .line 5
    invoke-direct {v0, v1, p1, p4, p5}, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/DialogNavigator;Ljava/lang/String;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V

    .line 6
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p2}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p2

    .line 7
    invoke-virtual {v0, p4, p2}, Landroidx/navigation/NavDestinationBuilder;->argument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 9
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 10
    :cond_1
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static final dialog(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V
    .locals 0
    .annotation build Landroidx/compose/runtime/ComposableInferredTarget;
        scheme = "[0[0]]"
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lr6/f;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final dialog(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V
    .locals 6
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Landroidx/compose/ui/window/DialogProperties;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/f;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Landroidx/compose/ui/window/DialogProperties;",
            "Lr6/f;",
            ")V"
        }
    .end annotation

    .line 11
    new-instance v0, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;

    .line 12
    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    const-class v2, Landroidx/navigation/compose/DialogNavigator;

    .line 13
    invoke-virtual {v1, v2}, Landroidx/navigation/NavigatorProvider;->getNavigator(Ljava/lang/Class;)Landroidx/navigation/Navigator;

    move-result-object v1

    check-cast v1, Landroidx/navigation/compose/DialogNavigator;

    move-object v2, p1

    move-object v3, p2

    move-object v4, p4

    move-object v5, p5

    .line 14
    invoke-direct/range {v0 .. v5}, Landroidx/navigation/compose/DialogNavigatorDestinationBuilder;-><init>(Landroidx/navigation/compose/DialogNavigator;Ly6/c;Ljava/util/Map;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V

    .line 15
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroidx/navigation/NavDeepLink;

    .line 16
    invoke-virtual {v0, p2}, Landroidx/navigation/NavDestinationBuilder;->deepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 17
    :cond_0
    invoke-virtual {p0, v0}, Landroidx/navigation/NavGraphBuilder;->destination(Landroidx/navigation/NavDestinationBuilder;)V

    return-void
.end method

.method public static dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    .line 1
    sget-object p2, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 2
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 3
    new-instance v4, Landroidx/compose/ui/window/DialogProperties;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/e;)V

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    goto :goto_1

    :cond_2
    move-object v4, p4

    goto :goto_0

    .line 4
    :goto_1
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V

    return-void
.end method

.method public static dialog$default(Landroidx/navigation/NavGraphBuilder;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p0, p5, 0x1

    if-eqz p0, :cond_0

    .line 5
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    :cond_0
    and-int/lit8 p0, p5, 0x2

    if-eqz p0, :cond_1

    .line 6
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    and-int/lit8 p0, p5, 0x4

    if-eqz p0, :cond_2

    .line 7
    new-instance p1, Landroidx/compose/ui/window/DialogProperties;

    const/4 p5, 0x7

    const/4 p6, 0x0

    const/4 p2, 0x0

    const/4 p3, 0x0

    const/4 p4, 0x0

    invoke-direct/range {p1 .. p6}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/e;)V

    .line 8
    :cond_2
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static dialog$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;ILjava/lang/Object;)V
    .locals 10

    and-int/lit8 v0, p6, 0x2

    if-eqz v0, :cond_0

    .line 9
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object p2

    :cond_0
    move-object v2, p2

    and-int/lit8 p2, p6, 0x4

    if-eqz p2, :cond_1

    .line 10
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v3, p3

    and-int/lit8 p2, p6, 0x8

    if-eqz p2, :cond_2

    .line 11
    new-instance v4, Landroidx/compose/ui/window/DialogProperties;

    const/4 v8, 0x7

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v4 .. v9}, Landroidx/compose/ui/window/DialogProperties;-><init>(ZZZILkotlin/jvm/internal/e;)V

    :goto_0
    move-object v0, p0

    move-object v1, p1

    move-object v5, p5

    goto :goto_1

    :cond_2
    move-object v4, p4

    goto :goto_0

    .line 12
    :goto_1
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->dialog(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Landroidx/compose/ui/window/DialogProperties;Lr6/f;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/Object;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 2
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/Object;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/Object;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 27
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2, p3}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Ly6/c;Ljava/util/Map;)V

    invoke-interface {p10, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 28
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 29
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 30
    :cond_0
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_1

    .line 31
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 32
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lr6/c;)V

    .line 33
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 34
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lr6/c;)V

    .line 35
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lr6/c;)V

    .line 36
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;)V
    .locals 11
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of navigation builder that supports AnimatedContent"
    .end annotation

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v10, p5

    .line 3
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static final synthetic navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 11
    .annotation runtime Lkotlin/Deprecated;
        level = .enum Lkotlin/DeprecationLevel;->HIDDEN:Lkotlin/DeprecationLevel;
        message = "Deprecated in favor of navigation builder that supports sizeTransform"
    .end annotation

    const/4 v9, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v10, p9

    .line 4
    invoke-static/range {v0 .. v10}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 2
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroidx/navigation/NamedNavArgument;",
            ">;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 5
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {p10, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 6
    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NamedNavArgument;

    invoke-virtual {p3}, Landroidx/navigation/NamedNavArgument;->component1()Ljava/lang/String;

    move-result-object p10

    invoke-virtual {p3}, Landroidx/navigation/NamedNavArgument;->component2()Landroidx/navigation/NavArgument;

    move-result-object p3

    .line 7
    invoke-virtual {p1, p10, p3}, Landroidx/navigation/NavDestination;->addArgument(Ljava/lang/String;Landroidx/navigation/NavArgument;)V

    goto :goto_0

    .line 8
    :cond_0
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 9
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_1

    .line 10
    :cond_1
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_2

    .line 11
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 12
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lr6/c;)V

    .line 13
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 14
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lr6/c;)V

    .line 15
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lr6/c;)V

    .line 16
    :cond_2
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 2
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static final navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V
    .locals 2
    .param p0    # Landroidx/navigation/NavGraphBuilder;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p1    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ly6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p6    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p7    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p8    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p9    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p10    # Lr6/c;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Landroidx/navigation/NavGraphBuilder;",
            "Ly6/c;",
            "Ly6/c;",
            "Ljava/util/Map<",
            "Ly6/q;",
            "Landroidx/navigation/NavType<",
            "*>;>;",
            "Ljava/util/List<",
            "Landroidx/navigation/NavDeepLink;",
            ">;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            "Lr6/c;",
            ")V"
        }
    .end annotation

    .line 17
    new-instance v0, Landroidx/navigation/NavGraphBuilder;

    invoke-virtual {p0}, Landroidx/navigation/NavGraphBuilder;->getProvider()Landroidx/navigation/NavigatorProvider;

    move-result-object v1

    invoke-direct {v0, v1, p1, p2, p3}, Landroidx/navigation/NavGraphBuilder;-><init>(Landroidx/navigation/NavigatorProvider;Ly6/c;Ly6/c;Ljava/util/Map;)V

    invoke-interface {p10, v0}, Lr6/c;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v0}, Landroidx/navigation/NavGraphBuilder;->build()Landroidx/navigation/NavGraph;

    move-result-object p1

    .line 18
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_0

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroidx/navigation/NavDeepLink;

    .line 19
    invoke-virtual {p1, p3}, Landroidx/navigation/NavDestination;->addDeepLink(Landroidx/navigation/NavDeepLink;)V

    goto :goto_0

    .line 20
    :cond_0
    instance-of p2, p1, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    if-eqz p2, :cond_1

    .line 21
    move-object p2, p1

    check-cast p2, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;

    invoke-virtual {p2, p5}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 22
    invoke-virtual {p2, p6}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setExitTransition$navigation_compose_release(Lr6/c;)V

    .line 23
    invoke-virtual {p2, p7}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopEnterTransition$navigation_compose_release(Lr6/c;)V

    .line 24
    invoke-virtual {p2, p8}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setPopExitTransition$navigation_compose_release(Lr6/c;)V

    .line 25
    invoke-virtual {p2, p9}, Landroidx/navigation/compose/ComposeNavGraphNavigator$ComposeNavGraph;->setSizeTransform$navigation_compose_release(Lr6/c;)V

    .line 26
    :cond_1
    invoke-virtual {p0, p1}, Landroidx/navigation/NavGraphBuilder;->addDestination(Landroidx/navigation/NavDestination;)V

    return-void
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p0, p10, 0x2

    if-eqz p0, :cond_0

    .line 16
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    :cond_0
    and-int/lit8 p0, p10, 0x4

    if-eqz p0, :cond_1

    .line 17
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 18
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 19
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 20
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 21
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/Object;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;ILjava/lang/Object;)V
    .locals 6

    and-int/lit8 p7, p6, 0x4

    if-eqz p7, :cond_0

    .line 1
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, p6, 0x8

    if-eqz p3, :cond_1

    .line 2
    sget-object p4, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-static/range {v0 .. v5}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;)V

    return-void
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 10

    move/from16 v0, p10

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 4
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    :cond_0
    move-object v3, p3

    and-int/lit8 p3, v0, 0x8

    if-eqz p3, :cond_1

    .line 5
    sget-object p3, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v4, p3

    goto :goto_0

    :cond_1
    move-object v4, p4

    :goto_0
    and-int/lit8 p3, v0, 0x10

    const/4 v1, 0x0

    if-eqz p3, :cond_2

    move-object v5, v1

    goto :goto_1

    :cond_2
    move-object v5, p5

    :goto_1
    and-int/lit8 p3, v0, 0x20

    if-eqz p3, :cond_3

    move-object v6, v1

    goto :goto_2

    :cond_3
    move-object/from16 v6, p6

    :goto_2
    and-int/lit8 p3, v0, 0x40

    if-eqz p3, :cond_4

    move-object v7, v5

    goto :goto_3

    :cond_4
    move-object/from16 v7, p7

    :goto_3
    and-int/lit16 p3, v0, 0x80

    if-eqz p3, :cond_5

    move-object v8, v6

    :goto_4
    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object/from16 v9, p9

    goto :goto_5

    :cond_5
    move-object/from16 v8, p8

    goto :goto_4

    .line 6
    :goto_5
    invoke-static/range {v0 .. v9}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 7
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 8
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 9
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p0, p10, 0x2

    if-eqz p0, :cond_0

    .line 10
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    :cond_0
    and-int/lit8 p0, p10, 0x4

    if-eqz p0, :cond_1

    .line 11
    sget-object p0, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    .line 12
    :cond_1
    invoke-static {}, Lkotlin/jvm/internal/k;->o()V

    const/4 p0, 0x0

    throw p0
.end method

.method public static navigation$default(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;ILjava/lang/Object;)V
    .locals 13

    move/from16 v0, p11

    and-int/lit8 v1, v0, 0x4

    if-eqz v1, :cond_0

    .line 13
    invoke-static {}, Lkotlin/collections/e0;->A()Ljava/util/Map;

    move-result-object v1

    move-object v5, v1

    goto :goto_0

    :cond_0
    move-object/from16 v5, p3

    :goto_0
    and-int/lit8 v1, v0, 0x8

    if-eqz v1, :cond_1

    .line 14
    sget-object v1, Lkotlin/collections/EmptyList;->INSTANCE:Lkotlin/collections/EmptyList;

    move-object v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p4

    :goto_1
    and-int/lit8 v1, v0, 0x10

    const/4 v2, 0x0

    if-eqz v1, :cond_2

    move-object v7, v2

    goto :goto_2

    :cond_2
    move-object/from16 v7, p5

    :goto_2
    and-int/lit8 v1, v0, 0x20

    if-eqz v1, :cond_3

    move-object v8, v2

    goto :goto_3

    :cond_3
    move-object/from16 v8, p6

    :goto_3
    and-int/lit8 v1, v0, 0x40

    if-eqz v1, :cond_4

    move-object v9, v7

    goto :goto_4

    :cond_4
    move-object/from16 v9, p7

    :goto_4
    and-int/lit16 v1, v0, 0x80

    if-eqz v1, :cond_5

    move-object v10, v8

    goto :goto_5

    :cond_5
    move-object/from16 v10, p8

    :goto_5
    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_6

    move-object v11, v2

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    move-object v2, p0

    goto :goto_6

    :cond_6
    move-object/from16 v11, p9

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object/from16 v12, p10

    .line 15
    :goto_6
    invoke-static/range {v2 .. v12}, Landroidx/navigation/compose/NavGraphBuilderKt;->navigation(Landroidx/navigation/NavGraphBuilder;Ly6/c;Ly6/c;Ljava/util/Map;Ljava/util/List;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;Lr6/c;)V

    return-void
.end method
