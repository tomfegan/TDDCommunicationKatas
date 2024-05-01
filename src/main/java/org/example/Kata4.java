package org.example;

public class Kata4 {
    /*
    Northcoders have introduced a like/dislike system for their lectures. Students can hit like or dislike at the end of each lecture.
    To avoid students accidentally hitting the dislike button (why would they ever do that?!), the interface supports clicking buttons again to undo the press.
    sing TDD, write a method that will take a sequence of button presses and determine the overall outcome.
    You can choose the input format: perhaps an enum for LIKE/DISLIKE, perhaps Strings...)
    Any two presses of the same button cancel out, so DISLIKE/DISLIKE is NEUTRAL. That means that DISLIKE/DISLIKE/LIKE is ultimately a LIKE.
    If the user has actively pressed both buttons, that also cancels out, so an uncancelled LIKE plus an uncancelled DISLIKE is also NEUTRAL.
    For example, LIKE/LIKE/LIKE/DISLIKE/DISLIKE/DISLIKE would be NEUTRAL.
     */

//    input of ENUM : LIKE / DISLIKE
//    Set up a counter variable
//    iterate through ENUM input
//    - Check value at index i is different to value at index i -1 <- dont do for index 0
//    - if like counter ++ , if dislike --
//    if counter > 0 return Like
//    if counter < 0 return Dislike
//    If counter == 0 then return neutral

}
