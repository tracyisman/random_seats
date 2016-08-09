# ruby_seating_chart.rb

class RubySeatingChart

    def set_up
        print "What is the period you want to make a seating chart for? "
        period = gets.chomp
        number = 0
        if period == 'A'
            number = 12
        elsif period == 'B'
            number = 28
        elsif period == 'C'
            number = 20
        elsif period == 'F'
            number = 24
        elsif period == 'G'
            number = 22
        else
            puts "Nice try. You suck"
            set_up
        end
        seats(number, period)
    end

    def seats(students, period)
        r = Random.new
        arr = []
        current_seat = r.rand(1..students)
        while (arr.length < students) do
            while (arr.index(current_seat) != nil) do
                current_seat = r.rand(1..students)
            end
            arr << current_seat
        end
        to_name(arr, period)
        puts ""
    end

    def to_name(array, period)
        count = 0
        while (array.length > 0) do
            num = array.pop
            count += 1
            to_switch(num, period)
            if count % 6 == 0
                puts ""
            end
        end
    end

    def to_switch(x, per)
        if per == 'A'
            case x
            when 1
                print 'Ryan     '
            when 2
                print 'Kyle     '
            when 3
                print 'Kira     '
            when 4
                print 'Alex     '
            when 5
                print 'Steven   '
            when 6
                print 'Mike     '
            when 7
                print 'Cooper   '
            when 8
                print 'Jake     '
            when 9
                print 'AJ       '
            when 10
                print 'Jimmy    '
            when 11
                print 'Graham   '
            when 12
                print 'Trevor   '
            end
        elsif per == 'B'
            case x
            when 1
                print 'Emily      '
            when 2
                print 'Makenzie   '
            when 3
                print 'Bryanna    '
            when 4
                print 'Gina       '
            when 5
                print 'Sam        '
            when 6
                print 'Dom        '
            when 7
                print 'Ladd       '
            when 8
                print 'Alexis     '
            when 9
                print 'Liana      '
            when 10
                print 'Billy      '
            when 11
                print 'Jenny      '
            when 12
                print 'Caroline   '
            when 13
                print 'Stephen    '
            when 14
                print 'Nick       '
            when 15
                print 'Garrett    '
            when 16
                print 'Leah       '
            when 17
                print 'Jeffrey    '
            when 18
                print 'Luke       '
            when 19
                print 'Abby       '
            when 20
                print 'Shawn      '
            when 21
                print 'Adam       '
            when 22
                print 'TJ         '
            when 23
                print 'Taylor     '
            when 24
                print 'Alyssa     '
            when 25
                print 'John       '
            when 26
                print 'Julia      '
            when 27
                print 'Lexi       '
            when 28
                print 'Jess       '
            end
        elsif per == 'C'
            case x
            when 1
                print 'Jonah     '
            when 2
                print 'EmilyB    '
            when 3
                print 'Brian      '
            when 4
                print 'Nick       '
            when 5
                print 'Nathan     '
            when 6
                print 'Sean       '
            when 7
                print 'Jon        '
            when 8
                print 'EmilyC     '
            when 9
                print 'Jack       '
            when 10
                print 'RyanG      '
            when 11
                print 'Ceilidh    '
            when 12
                print 'RyanK      '
            when 13
                print 'Grace      '
            when 14
                print 'Kelsey     '
            when 15
                print 'Jay        '
            when 16
                print 'Julia      '
            when 17
                print 'Ally       '
            when 18
                print 'Lily       '
            when 19
                print 'EmilyS     '
            when 20
                print 'Rich       '
            end
        elsif per == 'F'
            case x
            when 1
                print 'Jessie     '
            when 2
                print 'Emma       '
            when 3
                print 'Abbey      '
            when 4
                print 'Dylan      '
            when 5
                print 'Michelle   '
            when 6
                print 'AJ         '
            when 7
                print 'Danny      '
            when 8
                print 'Nicole     '
            when 9
                print 'Pat        '
            when 10
                print 'Sarah      '
            when 11
                print 'Ashley     '
            when 12
                print 'Alyssa     '
            when 13
                print 'Tom        '
            when 14
                print 'Kayla      '
            when 15
                print 'Becca      '
            when 16
                print 'Tadarius   '
            when 17
                print 'Tommy      '
            when 18
                print 'Alex       '
            when 19
                print 'Haylie     '
            when 20
                print 'Aidan      '
            when 21
                print 'Sean       '
            when 22
                print 'Nathaniel  '
            end
        elsif per == 'G'
            case x
            when 1
                print 'Chris     '
            when 2
                print 'Georgia   '
            when 3
                print 'Stephany  '
            when 4
                print 'David     '
            when 5
                print 'Kat       '
            when 6
                print 'Brian     '
            when 7
                print 'SeanF     '
            when 8
                print 'Avery     '
            when 9
                print 'Jeremy    '
            when 10
                print 'Alyssa    '
            when 11
                print 'Taylor    '
            when 12
                print 'TJ        '
            when 13
                print 'Gavin     '
            when 14
                print 'Kevin     '
            when 15
                print 'Kristen   '
            when 16
                print 'Noah      '
            when 17
                print 'Spencer   '
            when 18
                print 'Julianne  '
            when 19
                print 'SeanR     '
            when 20
                print 'Jeff      '
            when 21
                print 'Adam      '
            when 22
                print 'Justin    '
            when 23
                print 'Richie    '
            end
        end
    end
end

chairs = RubySeatingChart.new
chairs.set_up
